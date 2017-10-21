package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

/**
 * Created by sorre on 21.08.2017.
 */
public interface Model {

    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId); // added 7
    //List<User> getAllUsers(); // added 8
    void deleteUserById(long userId); // added 8
    void changeUserData(String name, long id, int level); // added 9

}
