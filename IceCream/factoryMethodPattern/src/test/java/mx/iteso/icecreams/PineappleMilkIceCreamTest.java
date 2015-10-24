package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.MangoMilkIceCream;
import icecream.icecreams.PineappleMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class PineappleMilkIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new PineappleMilkIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("pinia", iceCream.getFlavor());
    }
}
