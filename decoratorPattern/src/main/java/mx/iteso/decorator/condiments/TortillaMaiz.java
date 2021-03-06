package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class TortillaMaiz extends CondimentsDecorator {
    Taco taco;

    public TortillaMaiz (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " en tortilla de maiz";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }
}
