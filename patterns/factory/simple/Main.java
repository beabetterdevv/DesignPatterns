package patterns.factory.simple;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Pizza pepperoniPizza = simplePizzaFactory.makePizza("pepperoni");
    }
}

abstract class Pizza {}

class PepperoniPizza extends Pizza {}

class CheesePizza extends Pizza {}


class SimplePizzaFactory {
    public Pizza makePizza(String pizzaType) { //Nothing wrong with this - but it violates the open closed principle. To add a new pizza type, we need to inspect the guts of the classand make adjustments.
        if (pizzaType.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (pizzaType.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}

