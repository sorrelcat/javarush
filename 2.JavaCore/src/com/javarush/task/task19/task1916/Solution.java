package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fr1 = new FileReader(file1);
        FileReader fr2 = new FileReader(file2);

        List<String> original = new BufferedReader(fr1).lines().collect(Collectors.toList());
        List<String> modified = new BufferedReader(fr2).lines().collect(Collectors.toList());

        while (original.size() != 0 & modified.size() != 0) {
            if (original.get(0).equals(modified.get(0))) {
                lines.add(new LineItem(Type.SAME, original.remove(0)));
                modified.remove(0);
            } else if (modified.size() != 1 && original.get(0).equals(modified.get(1))) {
                lines.add(new LineItem(Type.ADDED, modified.remove(0)));
            } else if (original.size() != 1 && original.get(1).equals(modified.get(0))) {
                lines.add(new LineItem(Type.REMOVED, original.remove(0)));
            }
        }

        if (original.size() != 0) {
            lines.add(new LineItem(Type.REMOVED, original.remove(0)));
        } else if (modified.size() != 0) {
            lines.add(new LineItem(Type.ADDED, modified.remove(0)));
        }

        fr1.close();
        fr2.close();

    }

    /*оригинальный    редактированный    общий
    file1:          file2:             результат:(lines)

    строка1         строка1            SAME строка1     i=0     j=0
    строка2                            REMOVED строка2  i=1     j=0
    строка3         строка3            SAME строка3     i=2     j=1
    строка4                            REMOVED строка4  i=3     j=1
    строка5         строка5            SAME строка5     i=4     j=2
                    строка0            ADDED строка0    i=4     j=3
    строка1         строка1            SAME строка1     i=5     j=4
    строка2                            REMOVED строка2
    строка3         строка3            SAME строка3
                    строка5            ADDED строка5
    строка4         строка4            SAME строка4
    строка5                            REMOVED строка5*/


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

    }
}
