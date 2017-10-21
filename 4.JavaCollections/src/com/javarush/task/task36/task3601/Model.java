package com.javarush.task.task36.task3601;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sorre on 03.10.2017.
 */
public class Model {

    private static Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }

}
