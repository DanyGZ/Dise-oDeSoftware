package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.MangoMilkIceCream;
import icecream.icecreams.StrawBerryMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class StrawBerryMilkIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new StrawBerryMilkIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("fresa", iceCream.getFlavor());
    }
}
