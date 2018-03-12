package com.TomaszKarman.malze;

import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Crud {

    public List<Malza>listaMalzy;

    public int size() {

        int size = listaMalzy.size();
        return size;
    }


    public boolean isEmpty() {

        if (listaMalzy.size() < 1)
            return true;
        else
            return false;
    }

    public boolean contains(Malza o) {
        for (Malza m : listaMalzy) {
            if (o == m)
                return true;
        }
        ;
        return false;
    }

    public boolean add(Malza malza) {
        try {
            listaMalzy.add(malza);
        } catch (Exception x) {
            return false;
        }
        return true;
    }

    public boolean remove(Malza malza) {
        try {
            listaMalzy.remove(malza);
        } catch (Exception x) {
            return false;
        }
        return true;
    }

    public boolean update(Malza malza) {
        try {
            int last=listaMalzy.size() -1;
            listaMalzy.get(last).setAge(1);
        } catch (Exception x) {
            return false;
        }
        return true;
    }
}