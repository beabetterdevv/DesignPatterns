package patterns.command;

import patterns.command.commands.EverythingOffCommand;
import patterns.command.commands.EverythingOnCommand;
import patterns.command.commands.KitchenLightsOffCommand;
import patterns.command.commands.KitchenLightsOnCommand;
import patterns.command.hardware.KitchenLights;
import patterns.command.hardware.Music;

public class Main {

    public static void main(String[] args) {
        //Example 1 - Empty slots
        AlexaDevice alexa = new AlexaDevice();
        System.out.println(alexa);

//      ---------------------------------------------------------------

        //Example 2 - Kitchen Lights on
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//
//        //Set the slots with new commands
//        alexa.setCommand(
//                0,
//                new KitchenLightsOnCommand(kitchenLights),
//                new KitchenLightsOffCommand(kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateSlot(0);
//        alexa.deactivateSlot(0);

//      ---------------------------------------------------------------

        //Example 3 - Everything on!
//        AlexaDevice alexa = new AlexaDevice();
//
//        //Create an instance
//        KitchenLights kitchenLights = new KitchenLights();
//        Music music = new Music();
//
//        //Set the slots with new commands
//        alexa.setCommand(
//                1,
//                new EverythingOnCommand(music, kitchenLights),
//                new EverythingOffCommand(music, kitchenLights)
//        );
//
//        System.out.println(alexa);
//
//        alexa.activateSlot(1);
//        alexa.deactivateSlot(1);

    }
}
