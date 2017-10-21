package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {

        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        bs.write(65 + (int) (Math.random() * 26));
        bs.write(48 + (int) (Math.random() * 10));
        bs.write(65 + (int) (Math.random() * 26));
        bs.write(97 + (int) (Math.random() * 26));
        bs.write(97 + (int) (Math.random() * 26));
        bs.write(48 + (int) (Math.random() * 10));
        bs.write(65 + (int) (Math.random() * 26));
        bs.write(97 + (int) (Math.random() * 26));

        return bs;
    }
}

// numbers 48-57
// small characters 97-122
// big characters 65-90