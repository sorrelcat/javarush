package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        //Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt", Paths.get("D:/MyDownloads"));
        Path passwords = downloadFile("https://javarush.ru/images/lectures/image-ru-31-03.png", Paths.get("E:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method

        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();

        Path tmp = Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream, tmp);

        String fileName = urlString.substring(urlString.lastIndexOf("/") + 1);
        Path target = Paths.get(downloadDirectory + "/" + fileName);
        Files.move(tmp,target);

        return target;

    }
}