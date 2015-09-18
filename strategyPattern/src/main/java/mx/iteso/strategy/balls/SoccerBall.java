package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.ExplodeBall;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public class SoccerBall extends Ball {
    public SoccerBall() {
       super(new NormalBounce());
        deflateBehavior = new Deflatable();
        type = "Soccer ball";
        explodeBehavior = new ExplodeBall();
    }
}
