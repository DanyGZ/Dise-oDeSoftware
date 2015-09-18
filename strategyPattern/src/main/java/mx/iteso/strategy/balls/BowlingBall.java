package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplodeBall;

/**
 * Created by Daniel on 17/09/2015.
 */
public class BowlingBall extends Ball {
    public BowlingBall(){
        super(new IrregularBounce());
        deflateBehavior = new NotDeflatable();
        type = "Bowling ball";
        explodeBehavior = new NotExplodeBall();
    }
}
