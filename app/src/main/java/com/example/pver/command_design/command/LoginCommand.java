package com.example.pver.command_design.command;

import com.example.pver.command_design.receiver.LoginImpl;

/**
 * @author : dongyiming
 * @version : 1.0
 * @Description : TODO
 * @data : 2017/12/6 19:17
 * @package : com.example.pver.command_design.command
 */
public class LoginCommand implements Command{

    private LoginImpl mLoginImpl;
    public LoginCommand(LoginImpl mLoginImpl) {
        this.mLoginImpl = mLoginImpl;
    }

    @Override
    public void execute() {

        mLoginImpl.login();
    }
}
