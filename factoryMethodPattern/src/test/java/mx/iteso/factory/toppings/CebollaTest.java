package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 10/10/2015.
 */
public class CebollaTest {
    Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
        when(pozole.getToppings()).thenReturn("Adding toppings:");
    }

    @Test
    public void testToppings(){
        Pozole cebolla = new Cebolla(pozole);
        assertEquals("Adding toppings:\nCebolla", cebolla.getToppings());
    }
}
