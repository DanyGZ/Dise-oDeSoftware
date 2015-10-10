package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 10/10/2015.
 */
public class PozoleVerdePolloTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new PozoleVerdePollo();
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }
}
