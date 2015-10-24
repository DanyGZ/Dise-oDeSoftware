package mx.iteso;

import icecream.Cone;
import icecream.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 23/10/2015.
 */
public class ConeTest {
    IceCream iceCream;
    Cone cone;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
        when(iceCream.getBase()).thenReturn("leche");
        when(iceCream.getFlavor()).thenReturn("mango");
    }

    @Test
    public void testServe(){
        cone = new Cone();
        cone.prepare();
        cone.addIceCream(iceCream);
        assertEquals(cone.serve(), "Sirviendo cono con nieve de mango a base de leche");
    }
}
