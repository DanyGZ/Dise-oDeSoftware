package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.MangoMilkIceCream;
import icecream.icecreams.MangoWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class MangoWaterIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new MangoWaterIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("agua", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("mango", iceCream.getFlavor());
    }
}
