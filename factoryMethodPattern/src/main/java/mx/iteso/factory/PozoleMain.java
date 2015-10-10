package mx.iteso.factory;

import mx.iteso.factory.stores.AllPozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.toppings.*;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        PozoleStore allPozole = new AllPozoleStore("blanco");

        Pozole pozole = verdeStore.orderPozole("pollo");
        pozole = new Lechuga(pozole);
        pozole = new Rabanos(pozole);
        pozole = new Oregano(pozole);
        System.out.println(pozole.getToppings());
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        pozole = new Lechuga(pozole);
        pozole = new Limon(pozole);
        System.out.println(pozole.getToppings());
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("Lomo");
        pozole = new Lechuga(pozole);
        pozole = new Limon(pozole);
        pozole = new Col(pozole);
        pozole = new Cebolla(pozole);
        pozole = new Rabanos(pozole);
        pozole = new Oregano(pozole);
        System.out.println(pozole.getToppings());
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = allPozole.orderPozole("pollo");
        pozole = new Col(pozole);
        pozole = new Oregano(pozole);
        pozole = new Rabanos(pozole);
        System.out.println(pozole.getToppings());
        System.out.println("Fourth order is: " + pozole.getName());

    }
}