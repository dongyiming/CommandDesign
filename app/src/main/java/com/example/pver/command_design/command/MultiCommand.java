package com.example.pver.command_design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : dongyiming
 * @version : 1.0
 * @Description : TODO
 * @data : 2017/12/6 22:55
 * @package : com.example.pver.command_design.command
 */
public class MultiCommand implements Command {

    List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {

        for (Command command : commands) {
            command.execute();
        }
    }
}
