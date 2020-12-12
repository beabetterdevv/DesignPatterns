package patterns.command.hardware;

public class Music {
    private int volume;
    private float station;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
        this.volume = volume;
    }

    public float getStation() {
        return station;
    }

    public void setStation(float station) {
        System.out.println("Setting station to: " + station );
        this.station = station;
    }

    public void on() {
        System.out.println("Turning on Music");
        //activate hardware...
    }

    public void off() {
        System.out.println("Turning off Music");
        //deactivate hardware

    }
}
