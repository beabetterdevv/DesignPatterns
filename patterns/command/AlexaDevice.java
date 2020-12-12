package patterns.command;

import patterns.command.commands.Command;
import patterns.command.commands.NoOpCommand;

public class AlexaDevice {
    Command[] onCommands;
    Command[] offCommands;
    int slots = 3;

    public AlexaDevice() {
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        for (int i = 0; i < slots; i++) {
            onCommands[i] = new NoOpCommand();
            offCommands[i] = new NoOpCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        //slot between 0..2, neither commands can be nll
        if (onCommand == null || offCommand == null) {
            throw new IllegalArgumentException("Commands cannot be null!");
        } else {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void activateSlot(int slot) {
        onCommands[slot].execute();
    }

    public void deactivateSlot(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- Alexa Device Controller --------\n");
        for (int i = 0; i < slots; i++) {
            sb.append("Slot #" + i + " - " + onCommands[i].getClass().getSimpleName() + "(" + onCommands.getClass().getSimpleName() + ")" +
                    " - " + offCommands[i].getClass().getSimpleName() + "(" + offCommands.getClass().getSimpleName() + ")" +
                    "\n");
        }
        return sb.toString();
    }
}
