package com.example.pver.command_design;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pver.command_design.command.Command;
import com.example.pver.command_design.command.LoginCommand;
import com.example.pver.command_design.command.MultiCommand;
import com.example.pver.command_design.command.UserDateCommand;
import com.example.pver.command_design.invoker.ActionInvoker;
import com.example.pver.command_design.receiver.LoginImpl;
import com.example.pver.command_design.receiver.UserDateImpl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionInvoker actionInvoker = new ActionInvoker();
        Command loginCommand = new LoginCommand(new LoginImpl());
        Command userCommand = new UserDateCommand(new UserDateImpl());

        //宏命令
        MultiCommand multiCommand = new MultiCommand();
        multiCommand.add(loginCommand);
        multiCommand.add(userCommand);

        actionInvoker.setCommand(multiCommand);
        actionInvoker.dispatcherAction();

    }
}
