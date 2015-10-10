package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by Daniel on 10/10/2015.
 */
public class Oregano extends ToppingsDecorator {
    Pozole pozole;

    public Oregano(Pozole pozole){
        this.pozole = pozole;
        this.name = pozole.name;
    }

    @Override
    public String getToppings() {
        return pozole.getToppings() + "\nOregano";
    }
}
