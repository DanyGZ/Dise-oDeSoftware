package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class ArmBandsTest {

    @Test
    public void testArmBands(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm a Arm bands", armBands.display());
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
        assertEquals("I'm floating!", armBands.performFloat());
    }
}
