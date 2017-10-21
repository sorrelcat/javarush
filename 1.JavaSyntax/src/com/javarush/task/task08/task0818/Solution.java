package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("andreev", 5000);
        map.put("panteleev", 582);
        map.put("dymov", 555);
        map.put("titov", 200);
        map.put("kozlov", 136);
        map.put("polov", 524);
        map.put("stolov", 20);
        map.put("kompotov", 10);
        map.put("bashmakov", 258);
        map.put("iterov", 2999);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();        //значение
            if (value < 500) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}