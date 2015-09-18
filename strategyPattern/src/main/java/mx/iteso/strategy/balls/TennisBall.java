package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotExplodeBall;

/**
 * Created by Daniel on 17/09/2015.
 */
public class TennisBall extends Ball {
    public TennisBall(){
        super(new NormalBounce());
        deflateBehavior = new NotDeflatable();
        type = "Tennis ball";
        explodeBehavior = new NotExplodeBall();
    }
}
