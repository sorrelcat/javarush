package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {


        String resultFileName = args[0]; // сюда будем собирать
        int filePartCount = args.length - 1; // количество кусочков
        String[] fileNamePart = new String[filePartCount]; // массив с именами кусочков
        for (int i = 0; i < args.length - 1; i++) {
            fileNamePart[i] = args[i + 1];
        }
        Arrays.sort(fileNamePart);

        List<FileInputStream> fisList = new ArrayList<>(); // список потоков - по одному на кусок файла
        for (int i = 0; i < filePartCount; i++) {
            fisList.add(new FileInputStream(fileNamePart[i]));
        }
        // комбинируем несколько потоков в один, enumeration - интерфейс, чтобы в конструктор передать больше двух потоков
        SequenceInputStream seqInStream = new SequenceInputStream(Collections.enumeration(fisList));

        ZipInputStream zipInStream = new ZipInputStream(seqInStream); // разархивируем один файл из потоков для кусочков файла
        FileOutputStream fileOutStream = new FileOutputStream(resultFileName);
        byte[] buf = new byte[1024 * 1024];
        while (zipInStream.getNextEntry() != null) {
            int count;
            while ((count = zipInStream.read(buf)) != -1) { // фрагмент кусочка из архива
                fileOutStream.write(buf, 0, count); // пишем в нужный файл
            }
        }
        seqInStream.close();
        zipInStream.close();
        fileOutStream.close();


    }
}
