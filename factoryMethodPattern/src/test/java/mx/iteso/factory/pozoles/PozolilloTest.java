package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 10/10/2015.
 */
public class PozolilloTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new Pozolillo();
        assertEquals("Pozolillo con Pollo, Espinazo y Lomo", pozole.getName());
    }
}
