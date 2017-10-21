package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        private String fileContent = "";

        public void setFileName(String fullFileName) {

            this.fullFileName = fullFileName;
        }

        public String getFileContent()
        {
            return fileContent;
        }


      /*  Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName.
        А метод getFileContent, этого же класса, должен возвращать вычитанный контент. Возвращаемое значение -
        это одна строка, состоящая из строк файла, разделенных пробелами.*/

        @Override
        public void run() {

            try (BufferedReader fileReader = new BufferedReader(new FileReader(fullFileName))) {
                while (fileReader.ready()) {
                    fileContent += fileReader.readLine() + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
