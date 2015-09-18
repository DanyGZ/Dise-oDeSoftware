package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Flotable;

/**
 * Created by Daniel on 18/09/2015.
 */
public class WaterTube extends Lifesaver {
    public WaterTube(){
        type = "Water tube";
        deflateBehavior = new Deflatable();
        floatBehavior = new Flotable();
    }
}
