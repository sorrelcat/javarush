package com.javarush.task.task26.task2613;

import java.util.Map;

/**
 * Created by sorre on 16.10.2017.
 */
public class CurrencyManipulator {

    private String currencyCode;
    private Map<Integer, Integer> denominations;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
