package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplodeBall;

/**
 * Created by Daniel on 17/09/2015.
 */
public class GolfBall extends Ball {
    public GolfBall(){
        super(new NormalBounce());
        deflateBehavior = new NotDeflatable();
        type = "Golf ball";
        explodeBehavior = new NotExplodeBall();
    }
}
