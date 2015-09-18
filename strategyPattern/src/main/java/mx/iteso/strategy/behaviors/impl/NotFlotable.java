package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FloatBehavior;

/**
 * Created by Daniel on 18/09/2015.
 */
public class NotFlotable implements FloatBehavior {
    public String floating() {
        return "I can't float!";
    }
}
