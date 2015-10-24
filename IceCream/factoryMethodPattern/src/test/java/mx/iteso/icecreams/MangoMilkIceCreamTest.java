package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.GuavaMilkIceCream;
import icecream.icecreams.MangoMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class MangoMilkIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new MangoMilkIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("mango", iceCream.getFlavor());
    }
}
