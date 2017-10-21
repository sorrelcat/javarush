package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        //String name = "e:/1.txt";
        BufferedReader fr = new BufferedReader(new FileReader(name));
        String string = "";
        while (fr.ready()) {
            string += fr.readLine() + " ";
        }
        fr.close();
        String [] words = string.split(" ");
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equals(new StringBuilder(words[j]).reverse().toString())) {
                    Pair temp = new Pair(words[i], new StringBuilder(words[i]).reverse().toString());
                    if(!result.contains(temp))
                    result.add(temp);
                }
            }
        }

        for (Pair t : result
             ) {
            System.out.println(t.toString());
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {first = null; second = null;}

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
