package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by Daniel on 10/10/2015.
 */
public class Cebolla extends ToppingsDecorator {
    Pozole pozole;

    public Cebolla(Pozole pozole) {
        this.pozole = pozole;
        this.name = pozole.name;
    }

    @Override
    public String getToppings() {
        return pozole.getToppings() + "\nCebolla";
    }
}