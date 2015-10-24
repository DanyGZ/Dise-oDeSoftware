package icecream;


import icecream.stores.MilkIceCreamStore;
import icecream.stores.WaterIceCreamStore;

/**
 * Created by Daniel on 23/10/2015.
 */
public class IceCreamMain {
    public static void main(String args[]){
        prepareCone("leche", "piña");
        System.out.println();
        prepareCone("agua", "piña");
    }

    public static void prepareCone(String base, String flavor){
        IceCreamStore iceCreamStore;
        IceCream iceCream;
        Cone cone = new Cone();

        if(base.equals("leche")){
            iceCreamStore = new MilkIceCreamStore();
        }else if(base.equals("agua")){
            iceCreamStore = new WaterIceCreamStore();
        }else{
            iceCreamStore = null;
        }

        iceCream = iceCreamStore.createIceCream(flavor);

        cone.prepare();
        cone.addIceCream(iceCream);
        System.out.println(cone.serve());
    }
}
