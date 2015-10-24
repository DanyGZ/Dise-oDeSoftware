package icecream.stores;


import icecream.IceCream;
import icecream.IceCreamStore;
import icecream.icecreams.GuavaWaterIceCream;
import icecream.icecreams.MangoWaterIceCream;
import icecream.icecreams.PineappleWaterIceCream;
import icecream.icecreams.StrawBerryWaterIceCream;

/**
 * Created by Daniel on 23/10/2015.
 */
public class WaterIceCreamStore extends IceCreamStore {
    @Override
    public IceCream createIceCream(String flavor) {
        if(flavor.equals("guava")){
            return new GuavaWaterIceCream();
        }else if(flavor.equals("mango")){
            return new MangoWaterIceCream();
        }else if(flavor.equals("pinia")){
            return new PineappleWaterIceCream();
        }else if(flavor.equals("fresa")){
            return new StrawBerryWaterIceCream();
        }else{
            return null;
        }
    }
}
