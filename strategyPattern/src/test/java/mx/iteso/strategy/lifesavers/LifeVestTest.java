package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 18/09/2015.
 */
public class LifeVestTest {
    @Test
    public void testLifeVest(){
        LifeVest lifeVest = new LifeVest();
        assertEquals("I'm a Life vest", lifeVest.display());
        assertEquals("I can't deflate!", lifeVest.performDeflate());
        assertEquals("I can't inflate!", lifeVest.performInflate());
        assertEquals("I'm floating!", lifeVest.performFloat());
    }
}
