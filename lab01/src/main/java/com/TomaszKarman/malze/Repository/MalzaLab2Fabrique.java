package com.TomaszKarman.malze.Repository;

import com.TomaszKarman.malze.Domain.MalzaLab2;

import java.util.ArrayList;
import java.util.List;

public class MalzaLab2Fabrique{

    public static IMalzaLab2Repository getMalzaLab2(){
        return new MalzaLab2Repository();
    }

}
