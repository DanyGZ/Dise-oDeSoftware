package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 10/10/2015.
 */
public class MenudoTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new Menudo();
        assertEquals("Menudo", pozole.getName());
    }
}
