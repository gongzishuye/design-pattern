package com.bit.sharing.behavior.command;

/**
 * Created by chenlu on 2017/10/12.
 */
public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Command command = new CommandImp(executor);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
