package com.example.pver.command_design.command;

import com.example.pver.command_design.receiver.UserDateImpl;

/**
 * @author : dongyiming
 * @version : 1.0
 * @Description : TODO
 * @data : 2017/12/6 19:18
 * @package : com.example.pver.command_design.command
 */
public class UserDateCommand implements Command {

    private UserDateImpl mUserDateImpl;

    public UserDateCommand(UserDateImpl mUserDateImpl) {
        this.mUserDateImpl = mUserDateImpl;
    }

    @Override
    public void execute() {

        mUserDateImpl.getUserInfo();
    }
}
