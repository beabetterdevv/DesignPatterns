package patterns.command.commands;

import patterns.command.hardware.KitchenLights;
import patterns.command.hardware.Music;

public class EverythingOffCommand implements Command {
    Music music;
    KitchenLights kitchenLights;

    public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("--- PARTY TIME OVER! ---");
        kitchenLights.off();
        music.off();
        music.setVolume(0);
        music.setStation(0);
    }

}
