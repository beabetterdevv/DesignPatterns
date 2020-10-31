package patterns.decorator;

public class WithSugar extends CoffeeDecorator {

    Coffee coffee;

    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + .25;
    }
}
