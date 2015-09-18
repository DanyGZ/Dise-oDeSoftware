package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class FoamFloatTest {
    @Test
    public void testFoamFloat(){
        FoamFloat foamFloat = new FoamFloat();
        assertEquals("I'm a Foam float", foamFloat.display());
        assertEquals("I can't deflate!", foamFloat.performDeflate());
        assertEquals("I can't inflate!", foamFloat.performInflate());
        assertEquals("I'm floating!", foamFloat.performFloat());
    }
}
