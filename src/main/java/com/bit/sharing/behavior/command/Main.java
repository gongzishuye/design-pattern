package com.bit.sharing.behavior.command;

/**
 * Created by chenlu on 2017/10/12.
 */
public class Main {
    public static void main(String[] args) {
        Command command = new CommandImp();
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
