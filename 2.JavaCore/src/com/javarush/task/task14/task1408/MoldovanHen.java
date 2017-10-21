package com.javarush.task.task14.task1408;

/**
 * Created by sorre on 01.07.2017.
 */
public  class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 3;
    }

    public String getDescription()
    {
        return super.getDescription()+ " Моя страна - "+ Country.MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}