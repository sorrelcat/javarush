package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("andreev", "nikolay");
        map.put("panteleev", "ivan");
        map.put("dymov", "oleg");
        map.put("titov", "egor");
        map.put("kozlov", "igor");
        map.put("polov", "vasiliy");
        map.put("stolov", "vasiliy");
        map.put("andreev", "alex");
        map.put("bashmakov", "dmitriy");
        map.put("iterov", "lev");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
