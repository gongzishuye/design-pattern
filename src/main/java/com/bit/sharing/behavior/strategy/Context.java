package com.bit.sharing.behavior.strategy;

/**
 * @author chen lu
 * @date 2017/10/12
 * @time 14:09
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.action();
    }
}
