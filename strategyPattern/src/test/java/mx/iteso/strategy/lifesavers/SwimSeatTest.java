package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class SwimSeatTest {
    @Test
    public void testSwimSeat(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm a Swim seat", swimSeat.display());
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
        assertEquals("I'm floating!", swimSeat.performFloat());
    }
}
