package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 10/10/2015.
 */
public class PozoleBlancoEspinazoTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new PozoleBlancoEspinazo();
        assertEquals("Pozole Blanco con Espinazo", pozole.getName());
    }
}
