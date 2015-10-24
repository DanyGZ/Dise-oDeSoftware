package icecream.stores;


import icecream.IceCream;
import icecream.IceCreamStore;
import icecream.icecreams.GuavaMilkIceCream;
import icecream.icecreams.MangoMilkIceCream;
import icecream.icecreams.PineappleMilkIceCream;
import icecream.icecreams.StrawBerryMilkIceCream;

/**
 * Created by Daniel on 23/10/2015.
 */
public class MilkIceCreamStore extends IceCreamStore {
    @Override
    public IceCream createIceCream(String flavor) {
        if(flavor.equals("guava")){
            return new GuavaMilkIceCream();
        }else if(flavor.equals("mango")){
            return new MangoMilkIceCream();
        }else if(flavor.equals("pinia")){
            return new PineappleMilkIceCream();
        }else if(flavor.equals("fresa")){
            return new StrawBerryMilkIceCream();
        }else{
            return null;
        }
    }
}
