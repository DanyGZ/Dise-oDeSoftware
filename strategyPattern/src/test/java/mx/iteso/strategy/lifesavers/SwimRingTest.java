package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class SwimRingTest {
    @Test
    public void testSwimRing(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm a Swim ring", swimRing.display());
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
        assertEquals("I'm floating!", swimRing.performFloat());
    }
}
