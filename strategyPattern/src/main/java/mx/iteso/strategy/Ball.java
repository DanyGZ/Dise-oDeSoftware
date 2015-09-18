package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.ExplodeBehavior;

public abstract class Ball {

    private BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public ExplodeBehavior explodeBehavior;
    public String type;

    public BounceBehavior getBounceBehavior() {
        return bounceBehavior;
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public Ball(BounceBehavior bounce){

        this.bounceBehavior = bounce;
    }

    public Ball() {
    }

    public String explode(){
        return explodeBehavior.explode();
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {

        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

}
