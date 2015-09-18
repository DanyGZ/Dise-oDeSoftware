package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 17/09/2015.
 */
public class CristalBallTest {
    @Test
    public void testCristalBall() {
        CristalBall cristalBall = new CristalBall();
        assertEquals("I crashed!! I can't bounce", cristalBall.performBounce());
        assertEquals("I can't deflate!", cristalBall.performDeflate());
        assertEquals("I can't inflate!", cristalBall.performInflate());
        assertEquals("Cristal ball is rolling!", cristalBall.roll());
        assertEquals("I can't explode", cristalBall.explode());
    }
}
