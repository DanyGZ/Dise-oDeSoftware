package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.GuavaMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class GuavaMilkIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new GuavaMilkIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("leche", iceCream.getBase());
    }

     @Test
    public void testFlavor(){
         assertEquals("guava", iceCream.getFlavor());
     }
}
