package com.bit.sharing.behavior.strategy;

/**
 * @author chen lu
 * @date 2017/10/12
 * @time 14:11
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new StrategyB());
        context.doSomething();
    }
}
