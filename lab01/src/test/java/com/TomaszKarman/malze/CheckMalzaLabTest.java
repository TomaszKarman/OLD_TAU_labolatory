package com.TomaszKarman.malze;

import com.TomaszKarman.malze.Domain.MalzaLab2;
import com.TomaszKarman.malze.Repository.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CheckMalzaLab2Test {

    //IMalzaLab2Repository malze;

    MalzaLab2 szczerzuja;
    MalzaLab2 omulek;
    MalzaLab2 mule;
    List<MalzaLab2> malzeLab2;


    @Test
    public void isMalzaLab2() {
        MalzaLab2 nova = new MalzaLab2(4);
        assertNotNull(nova);
    }

    @Test
    public void addTest() {
        MalzaLab2Repository repo;
        repo = (MalzaLab2Repository) MalzaLab2Fabrique.getMalzaLab2();
        Integer liczbaMalzWBazieDanych= repo.getAll().size();
        assertTrue(repo.add(szczerzuja));
        assertTrue(repo.add(mule));
        Integer liczbaMalzWBazieDanychPoDodaniuMalzy= repo.getAll().size();
        assertNotEquals(liczbaMalzWBazieDanych,liczbaMalzWBazieDanychPoDodaniuMalzy);
    }


    @Test
    public void update() {

        MalzaLab2Repository repo;
        repo = (MalzaLab2Repository) MalzaLab2Fabrique.getMalzaLab2();

        assertTrue(repo.add(szczerzuja));
        assertTrue(repo.add(mule));

        MalzaLab2 malza = repo.get(0);
        //edycja pola w malza
        malza.setName("jakas");
        repo.update(malza);
        assertEquals(malza.getName(),repo.get(0));
        assertNotEquals(malza.getName(),repo.get(1));

    }

    @Test
    public void remove() {
        MalzaLab2Repository repo;
        repo = (MalzaLab2Repository) MalzaLab2Fabrique.getMalzaLab2();
        assertTrue(repo.add(szczerzuja));
        assertTrue(repo.add(mule));
        Integer liczbaMalzWBazieDanych= repo.getAll().size();
        repo.remove(mule);
        Integer liczbaMalzWBazieDanychPoRemove= repo.getAll().size();
        assertNotEquals(liczbaMalzWBazieDanych,liczbaMalzWBazieDanychPoRemove);
        assertTrue(repo.size()>0);
    }

    @Before
    public void setUp() {
        szczerzuja = new MalzaLab2(1);
        omulek = new MalzaLab2(2);
        mule = new MalzaLab2(3);

        malzeLab2 = new ArrayList<>();
    }

    //@After
    //public void tearDown() throws Exception {
    //}
}