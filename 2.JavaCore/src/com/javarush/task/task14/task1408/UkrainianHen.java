package com.javarush.task.task14.task1408;

import com.javarush.task.task14.task1408.*;
import com.javarush.task.task14.task1408.Solution;

/**
 * Created by sorre on 01.07.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 2;
    }

    public String getDescription()
    {
        return super.getDescription()+ " Моя страна - "+ Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
