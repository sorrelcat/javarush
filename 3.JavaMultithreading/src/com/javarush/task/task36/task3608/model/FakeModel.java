package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

/**
 * Created by sorre on 21.08.2017.
 */
public class FakeModel implements Model {

    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    public void loadUsers() {
        modelData.getUsers().add(new User("A", 2, 1));
        modelData.getUsers().add(new User("B", 2, 1));
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {

        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteUserById(long userId) {
        throw new UnsupportedOperationException(); // added 8
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

    public List<User> getAllUsers() {
        throw new UnsupportedOperationException();
    }


}
