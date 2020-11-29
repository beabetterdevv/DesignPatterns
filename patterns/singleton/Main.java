package patterns.singleton;

public class Main {

    public static void main(String[] args) {
//        Rocketship r1 = new Rocketship();

        Rocketship r2 = Rocketship.getInstance();
        Rocketship r3 = Rocketship.getInstance();

        System.out.println(r2);
        System.out.println(r3);

    }
}








