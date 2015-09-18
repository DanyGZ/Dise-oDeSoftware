package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class LifeSaversCandyTest {
    @Test
    public void testLifeSaversCandy(){
        LifesaversCandy lifesaversCandy = new LifesaversCandy();
        assertEquals("I'm a Life saver candy", lifesaversCandy.display());
        assertEquals("I can't deflate!", lifesaversCandy.performDeflate());
        assertEquals("I can't inflate!", lifesaversCandy.performInflate());
        assertEquals("I can't float!", lifesaversCandy.performFloat());
    }
}
