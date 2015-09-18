package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFlotable;

/**
 * Created by Daniel on 18/09/2015.
 */
public class LifesaversCandy extends Lifesaver {
    public LifesaversCandy(){
        type = "Life saver candy";
        deflateBehavior = new NotDeflatable();
        floatBehavior = new NotFlotable();
    }
}
