package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        int count = 0;

        for (K temp: map.keySet()
                ) {
            count += map.get(temp).size();
        }

        return count;
    }

    @Override
    public V put(K key, V value) {
        if (!containsKey(key)) {
            List<V> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
            return null;
        }

        for (K temp: map.keySet()
                ) {
            if(temp.equals(key)) {
                if(map.get(key).size() < repeatCount) {
                    map.get(key).add(value);
                }
                else {
                    map.get(key).remove(0);
                    map.get(key).add(value);
                }
                return map.get(key).get(map.get(key).size()-2);
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {

        List<V> list = map.get(key);
        if (list == null)
            return null;

        V result = list.get(0);
        list.remove(0);

        if (list.size() == 0)
            map.remove(key);

        return result;
    }



    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> list = new ArrayList<V>();
        for (K temp: map.keySet()
                ) {
            for (int i = 0; i < map.get(temp).size(); i++) {
                list.add(map.get(temp).get(i));
            }
        }
        return list;
    }

    @Override
    public boolean containsKey(Object key) {
        return map.keySet().contains(key);
    }

    @Override
    public boolean containsValue(Object value) {

        for (K temp: map.keySet()
             ) {
            for (int i = 0; i < map.get(temp).size(); i++) {
                if(value.equals(map.get(temp).get(i))) return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}