package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sorre on 05.10.2017.
 */
public class Solution {

    public static void main (String [] args) {

        testStrategy(new HashMapStorageStrategy(), 10000);
        testStrategy(new OurHashMapStorageStrategy(), 10000);
        testStrategy(new FileStorageStrategy(), 100);
        testStrategy(new OurHashBiMapStorageStrategy(), 10000);
        testStrategy(new HashBiMapStorageStrategy(), 10000);
        testStrategy(new DualHashBidiMapStorageStrategy(), 10000);

    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> ids = new HashSet<Long>();
        for (String temp : strings
             ) {
            ids.add(shortener.getId(temp));
        }
        return ids;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        Set<String> strings = new HashSet<String>();
        for (Long temp: keys
             ) {
            strings.add(shortener.getString(temp));
        }
        return strings;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> randomStringSet = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            randomStringSet.add(Helper.generateRandomString());
        }

        Shortener shortener = new Shortener(strategy);
        Date startDate = new Date();
        Set<Long> ids = getIds(shortener, randomStringSet);
        Date finishDate = new Date();
        Long difference = finishDate.getTime() - startDate.getTime();
        Helper.printMessage(difference.toString());
        Date startDate1 = new Date();
        Set<String> strings = getStrings(shortener, ids);
        Date finishDate1 = new Date();
        Long difference1 = finishDate1.getTime() - startDate1.getTime();
        Helper.printMessage(difference1.toString());
        if (strings.equals(randomStringSet))
            Helper.printMessage("Тест пройден.");
        else
            Helper.printMessage("Тест не пройден.");
    }
}
