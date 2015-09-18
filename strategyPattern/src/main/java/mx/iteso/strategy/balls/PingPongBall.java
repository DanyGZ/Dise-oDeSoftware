package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by Daniel on 17/09/2015.
 */
public class PingPongBall extends Ball {
    public PingPongBall(){
        super(new NormalBounce());
        deflateBehavior = new NotDeflatable();
        type = "Ping Pong ball";
        explodeBehavior = new NotExplodeBall();
    }
}
