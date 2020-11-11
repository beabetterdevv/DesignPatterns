package patterns.factory.standard.pizza.NY;

import patterns.factory.standard.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
//        this.toppings.add("Cheese");
//        this.toppings.add("Cheese");
        System.out.println("Preparing `NY Style Cheese Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("NY Style Cheese Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Style Cheese Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Style Cheese Pizza...");
    }
}
