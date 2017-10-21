package com.javarush.task.task35.task3509;

import java.util.*;


/* 
Collections & Generics
*/
public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T ... elements) {
        //напишите тут ваш код

        ArrayList<T> list = new ArrayList<>();
        for (T o : elements
             ) {
            list.add(o);
        }

        return list;
    }

    public static <T> HashSet<T> newHashSet(T ... elements) {
        //напишите тут ваш код

        HashSet<T> set = new HashSet<>();

        for (T o : elements
             ) {
            set.add(o);
        }

        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        //напишите тут ваш код

        if(keys.size() != values.size()) throw new IllegalArgumentException();
        else {
            HashMap<K, V> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put((K) keys.get(i), (V) values.get(i));
            }
            return map;
        }
    }
}
