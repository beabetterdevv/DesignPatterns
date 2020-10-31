package patterns.strategy;

public class Main {

    public static void main(String[] args) {
        FlyBehaviour flyWithWings = new FlyWithWings();
        Duck mallardDuck = new MallardDuck(flyWithWings);

        mallardDuck.performFly();

    }
}


