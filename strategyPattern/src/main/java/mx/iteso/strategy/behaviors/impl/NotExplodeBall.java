package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.ExplodeBehavior;

/**
 * Created by Daniel on 17/09/2015.
 */
public class NotExplodeBall implements ExplodeBehavior {

    public String explode() {
        return "I can't explode";
    }
}
