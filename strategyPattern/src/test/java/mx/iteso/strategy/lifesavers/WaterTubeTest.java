package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class WaterTubeTest {
    @Test
    public void testWaterTube(){
        WaterTube waterTube = new WaterTube();
        assertEquals("I'm a Water tube", waterTube.display());
        assertEquals("I'm deflating!", waterTube.performDeflate());
        assertEquals("I'm inflating!", waterTube.performInflate());
        assertEquals("I'm floating!", waterTube.performFloat());
    }
}
