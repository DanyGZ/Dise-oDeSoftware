package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.MangoMilkIceCream;
import icecream.icecreams.PineappleWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class PineappleWaterIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new PineappleWaterIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("agua", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("pinia", iceCream.getFlavor());
    }
}
