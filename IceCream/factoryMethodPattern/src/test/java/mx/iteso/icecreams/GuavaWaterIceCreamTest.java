package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.GuavaMilkIceCream;
import icecream.icecreams.GuavaWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class GuavaWaterIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new GuavaWaterIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("agua", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("guava", iceCream.getFlavor());
    }
}
