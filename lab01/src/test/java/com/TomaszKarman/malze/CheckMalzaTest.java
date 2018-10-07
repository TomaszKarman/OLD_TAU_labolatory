package com.TomaszKarman.malze;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

public class CheckMalzaTest {

    public void testCheckMalza() {
        Malza malza3 = new Malza("Czesiu", 3);
        Malza malza4 = new Malza("Zbychu", 7);
        //Crud crud = new Crud();



        malze.add(malza3);
        malze.add(malza4);

        Integer quantity = malze.size();
	Integer test = 2;
        Enum status = malza4.getStatus();
        assertNotNull(malze);
        assertSame(status, Malza.Status.Dead);
        assertEquals(quantity, test);


        /* CRUD NA DB
        assertTrue(crud.add(malza3));
        assertTrue(crud.add(malza4));
        assertTrue(crud.update(malza4));
        assertEquals(crud.listaMalzy.get(1).getStatus(),Malza.Status.Live);
        assertTrue(crud.remove(malza4));
        assertEquals(1,crud.size());

    }

}
