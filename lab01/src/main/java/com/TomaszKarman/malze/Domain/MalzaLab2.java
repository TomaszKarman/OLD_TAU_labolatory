package com.TomaszKarman.malze.Domain;

public class MalzaLab2 {

    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MalzaLab2(int id) {
        this.id = id;
        this.name = name;
    }
}
