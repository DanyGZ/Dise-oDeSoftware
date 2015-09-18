package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplodeBall;

/**
 * Created by Daniel on 17/09/2015.
 */
public class CristalBall extends Ball {
    public CristalBall(){
        super(new Crash());
        deflateBehavior = new NotDeflatable();
        type = "Cristal ball";
        explodeBehavior = new NotExplodeBall();
    }
}
