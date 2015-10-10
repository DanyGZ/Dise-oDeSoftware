package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 10/10/2015.
 */
public class PozoleBlancoCacheteTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new PozoleBlancoCachete();
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }
}
