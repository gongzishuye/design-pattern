package com.bit.sharing.behavior.command;

/**
 * Created by chenlu on 2017/10/12.
 */
public class CommandImp implements Command{

    private Executor executor;

    public CommandImp(Executor executor) {
        this.executor = executor;
    }

    public void run() {
        executor.execute();
    }
}

