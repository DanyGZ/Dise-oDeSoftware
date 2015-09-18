package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 17/09/2015.
 */
public class BowllingBallTest {
    @Test
    public void testBowlingBallBall() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
        assertEquals("I can't explode", bowlingBall.explode());
    }
}
