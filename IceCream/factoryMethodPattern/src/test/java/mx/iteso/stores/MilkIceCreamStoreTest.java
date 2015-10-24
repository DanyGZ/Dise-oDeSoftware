package mx.iteso.stores;

import icecream.IceCream;
import icecream.IceCreamStore;
import icecream.stores.MilkIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 23/10/2015.
 */
public class MilkIceCreamStoreTest {
    IceCream iceCream;
    IceCreamStore iceCreamStore;

    @Before
    public void setUp(){
        iceCreamStore = new MilkIceCreamStore();
    }

    @Test
    public void testWithGuava(){
        iceCream = iceCreamStore.createIceCream("guava");
        assertEquals("guava", iceCream.getFlavor());
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testWithMango(){
        iceCream = iceCreamStore.createIceCream("mango");
        assertEquals("mango", iceCream.getFlavor());
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testWithPineapple(){
        iceCream = iceCreamStore.createIceCream("pinia");
        assertEquals("pinia", iceCream.getFlavor());
        assertEquals("leche", iceCream.getBase());
    }

    @Test
    public void testWithFresa(){
        iceCream = iceCreamStore.createIceCream("fresa");
        assertEquals("fresa", iceCream.getFlavor());
        assertEquals("leche", iceCream.getBase());
    }

    @Test (expected = NullPointerException.class)
    public void testWithNull(){
        iceCream = iceCreamStore.createIceCream("");
        assertEquals("fresa", iceCream.getFlavor());
    }
}
