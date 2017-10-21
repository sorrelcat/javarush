package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.model.Strategy;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sorre on 10.10.2017.
 */
public class Controller {


    private Provider[] providers;

    public Controller(Provider... providers) {
        this.providers = providers;

        if (providers == null || providers.length == 0) throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {

        List<Vacancy> allVacancies = new ArrayList<>();

        List<Vacancy> currentVacancies;
        for (Provider currentProvider : providers) {
            try {
                currentVacancies = currentProvider.getJavaVacancies("odessa");
                allVacancies.addAll(currentVacancies);
                currentVacancies.clear();
            } catch (NullPointerException npe) {
            }
        }
        System.out.println(allVacancies.size());
        for (Vacancy v : allVacancies) {
            System.out.println(v.getTitle() + " : " + v.getCity() + " : "
                    + v.getCompanyName() + " : " + v.getSalary() + " : " + v.getUrl());
        }

    }

}
