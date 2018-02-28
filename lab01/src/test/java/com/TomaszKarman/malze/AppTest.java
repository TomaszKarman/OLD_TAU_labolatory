import package com.TomaszKarman.malze;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

class CheckMalzaTest {
    @Test
    public void testCheckMalza() {
        public Malza malza1 = new Malza("Czesiu",3);
        public Malza malza2 = new Malza("Zbychu", 7);
        public ArrayList<Malza> malze = new ArrayList<Malza>();
        malze.add(malza1);
        malze.add(malza2);

        public Integer quantity = malze.size();
        public Enum status = malza2.getStatus();
        assertNotNull(malza2);
        assertEquals(status, Malza.Status.Dead);
        assertEquals(quantity, 2);
    }
}
