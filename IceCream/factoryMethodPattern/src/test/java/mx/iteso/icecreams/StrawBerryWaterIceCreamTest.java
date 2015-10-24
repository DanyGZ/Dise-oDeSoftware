package mx.iteso.icecreams;

import icecream.IceCream;
import icecream.icecreams.StrawBerryMilkIceCream;
import icecream.icecreams.StrawBerryWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class StrawBerryWaterIceCreamTest {
    IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = new StrawBerryWaterIceCream();
    }

    @Test
    public void testBase(){
        assertEquals("agua", iceCream.getBase());
    }

    @Test
    public void testFlavor(){
        assertEquals("fresa", iceCream.getFlavor());
    }
}
