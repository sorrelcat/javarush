package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sorre on 28.08.2017.
 */
public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();


    private static class Handler extends Thread {

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            String name = "";
            Message m = null;
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                m = connection.receive();
                if (m.getType() != MessageType.USER_NAME) continue;
                if (m.getData().isEmpty()) continue;
                name = m.getData();
                if (connectionMap.containsKey(name)) continue;
                connectionMap.put(name, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED));
                break;
            }
            return name;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException {
            Iterator<Map.Entry<String, Connection>> t = connectionMap.entrySet().iterator();
            while (t.hasNext()) {
                Map.Entry<String, Connection> entry = t.next();
                String name = entry.getKey();
                if (!name.equals(userName)) connection.send(new Message(MessageType.USER_ADDED, name));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {

            while (true) {
                Message m = connection.receive();
                if (m.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(m.getType(), userName + ": " + m.getData()));
                } else {
                    System.out.println("Non-text message");
                }
            }
        }

        public void run() {

            if (socket != null && socket.getRemoteSocketAddress() != null) {
                ConsoleHelper.writeMessage("Established a new connection to a remote socket address: " + socket.getRemoteSocketAddress());
            }
            String userName = null;

            try (Connection connection = new Connection(socket)) {

                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("An exchange of data error to a remote socket address");
            } finally {
                if (userName != null) {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
                ConsoleHelper.writeMessage("Closed connection to a remote socket address: "); // + socketAddress);
            }
        }
    }


    public static void sendBroadcastMessage(Message message) {

        Iterator<Map.Entry<String, Connection>> t = connectionMap.entrySet().iterator();
        while (t.hasNext()) {
            Map.Entry<String, Connection> entry = t.next();

            try {
                entry.getValue().send(message);
            } catch (IOException e) {
                System.out.println("Error while sending message");
            }
        }
    }

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Input server port: ");
        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Server started");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Something wrong, Server socket closed.");
        }
    }

}
