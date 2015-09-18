package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class SwimBeltTest {
    @Test
    public void testSwimBelt(){
        SwimBelt swimBelt = new SwimBelt();
        assertEquals("I'm a Swim belt", swimBelt.display());
        assertEquals("I can't deflate!", swimBelt.performDeflate());
        assertEquals("I can't inflate!", swimBelt.performInflate());
        assertEquals("I'm floating!", swimBelt.performFloat());
    }
}
