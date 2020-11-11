package patterns.factory.standard.store;

import patterns.factory.standard.pizza.NY.NYStyleCheesePizza;
import patterns.factory.standard.pizza.NY.NYStylePepperoniPizza;
import patterns.factory.standard.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
