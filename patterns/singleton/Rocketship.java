package patterns.singleton;

public class Rocketship {

    //Class level static instance
    private static Rocketship rocketship;

    //Private Constructor to prevent multiple instances
    private Rocketship() { }

    //Factory method to retrieve instance
    public static Rocketship getInstance() {
            if (rocketship == null) {
                synchronized (Rocketship.class) {
                    rocketship = new Rocketship();
                }

            }
        return rocketship;
    }
}








