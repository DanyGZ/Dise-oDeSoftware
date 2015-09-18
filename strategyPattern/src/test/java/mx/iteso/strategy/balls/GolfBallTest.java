package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 17/09/2015.
 */
public class GolfBallTest {
    @Test
    public void testGolfBall() {
        GolfBall golfBall = new GolfBall();
        assertEquals("I'm bouncing normally!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("Golf ball is rolling!", golfBall.roll());
        assertEquals("I can't explode", golfBall.explode());
    }
}
