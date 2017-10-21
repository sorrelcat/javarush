package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sorre on 10.10.2017.
 */
public class Provider {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Provider(Strategy strategy) {

        this.strategy = strategy;
    }

    public Provider() {
    }

    public List<Vacancy> getJavaVacancies(String searchString) {

        if (this.strategy == null)
            return Collections.emptyList();
        return strategy.getVacancies(searchString);
    }
}

