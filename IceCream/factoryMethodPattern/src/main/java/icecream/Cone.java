package icecream;

/**
 * Created by Daniel on 23/10/2015.
 */
public class Cone {
    public IceCream icecream;

    public void prepare(){
        System.out.println("Preparando cono...");
    }

    public void addIceCream(IceCream icecream){
        this.icecream = icecream;
    }

    public String serve(){
        return "Sirviendo cono con nieve de " + icecream.getFlavor() + " a base de " + icecream.getBase();
    }
}
