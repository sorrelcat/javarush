package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("andreev", "nikolay");
        map.put("panteleev", "ivan");
        map.put("dymov", "oleg");
        map.put("titov", "egor");
        map.put("kozlov", "igor");
        map.put("polov", "vasiliy");
        map.put("stolov", "vasiliy");
        map.put("kompotov", "alex");
        map.put("bashmakov", "dmitriy");
        map.put("iterov", "lev");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap <String, String> copy = new HashMap <String, String>(map);
        for (Map.Entry <String, String> pair : copy.entrySet()) {
            int result = 0;
            for (Map.Entry <String, String> pair2 : map.entrySet())
                if (pair2.getValue().equals(pair.getValue()))
                    result++;
            if (result > 1)
                removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
