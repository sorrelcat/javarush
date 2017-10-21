package com.javarush.task.task20.task2024;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/
public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();
    private static final long serialVersionUID =1;

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeInt(node);
        os.reset();
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {

        is.defaultReadObject();
        node = is.readInt();
    }

    public static void main(String[] args) {

    }
}
