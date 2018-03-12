package com.TomaszKarman.malze;

import com.TomaszKarman.malze.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CheckMalzaTest {

    @Test
    public void testCheckMalza() {
        Malza malza3 = new Malza("Czesiu", 3);
        Malza malza4 = new Malza("Zbychu", 7);
        Crud malze = new Crud();

        // kod z lab01 - zastapiony kodem z lab02
        /*malze.add(malza3);
        malze.add(malza4);

        Integer quantity = malze.size();
	Integer test = 2;
        Enum status = malza4.getStatus();
        assertNotNull(malze);
        assertSame(status, Malza.Status.Dead); //ZLA METODA DO TEGO
        assertEquals(quantity, test);
        */

        assertTrue(malze.add(malza3));
        assertTrue(malze.add(malza4));
        assertTrue(malze.update(malza4));
        assertEquals(malze.listaMalzy.get(1).getStatus(),Malza.Status.Live);
        assertTrue(malze.remove(malza4));
        assertEquals(1,malze.size());
    }
}
