package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigo;
    public QuestionFileOutputStream (AmigoOutputStream aos)
    {
        this.amigo = aos;
    }

    public AmigoOutputStream getAmigo() {
        return amigo;
    }

    public void flush() throws IOException {
        amigo.flush();
    }

    public void write(int b) throws IOException {
        amigo.write(b);
    }

    public void write(byte[] b) throws IOException {
        amigo.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        amigo.write(b, off, len);
    }

    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();
        if(answer.equals("Д")) amigo.close();
    }


}

