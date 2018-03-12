package com.TomaszKarman.malze.Repository;

import com.TomaszKarman.malze.Domain.MalzaLab2;

import java.util.List;

public interface IMalzaLab2Repository {
    Boolean add(MalzaLab2 malza);
    Boolean remove();

    Boolean remove(MalzaLab2 malza);

    void update(MalzaLab2 malza);

    Integer size();

    MalzaLab2 get(Integer id);


    List<MalzaLab2> getAll();
}
