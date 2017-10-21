package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

/**
 * Created by sorre on 30.09.2017.
 */
public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E,Object> map;

    @Override
    public Iterator<E> iterator() {

        ArrayList<E> mapKeys = new ArrayList<E>();

        for (Map.Entry<E, Object> entry : map.entrySet()) {
            mapKeys.add(entry.getKey());
        }

        return mapKeys.iterator();
    }

    public boolean isEmpty() {
        if(this.map.size() == 0) return true;
        return false;
    }

    public boolean contains(Object o) {
        return map.get(o) != null ? true : false;
    }

    public void clear() {
        this.map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return this.map.remove(o) == null ? false : true;
    }

    @Override
    public boolean add(E e) {
        return null == map.put(e, PRESENT);
    }

    @Override
    public int size() {
        return map.size();
    }

    public AmigoSet() {
        this.map = new HashMap<E,Object>();
    }

    public AmigoSet(Collection<? extends E> collection) {

        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        this.addAll(collection);
    }

}
