package com.bit.sharing.behavior.command;

/**
 * Created by chenlu on 2017/10/12.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.run();
    }
}
