package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Flotable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Daniel on 18/09/2015.
 */
public class SwimBelt extends Lifesaver {
    public SwimBelt(){
        type = "Swim belt";
        deflateBehavior = new NotDeflatable();
        floatBehavior = new Flotable();
    }
}
