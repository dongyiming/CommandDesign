package com.example.pver.command_design.invoker;

import com.example.pver.command_design.command.Command;

/**
 * @author : dongyiming
 * @version : 1.0
 * @Description : TODO
 * @data : 2017/12/6 19:24
 * @package : com.example.pver.command_design.invoker
 */
public class ActionInvoker {


    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void dispatcherAction() {
        this.command.execute();
    }


}
