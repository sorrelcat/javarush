package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();        //значение
            if (value == name) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();        //значение
            if (key == lastName) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
