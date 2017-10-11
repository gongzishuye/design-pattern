package com.bit.sharing.behavior.observer;

/**
 * @author chen lu
 * @date 2017/10/11
 * @time 16:27
 */
public class Main {
    public static void main(String[] args) {
        Observerable observerable = new Observerable();

        Observer observer1 = new Observer() {
            public void update(Object arg) {
                System.out.println("number 1 receive the msg!");
            }
        };
        Observer observer2 = new Observer() {
            public void update(Object arg) {
                System.out.println("number 2 receive the msg!");
            }
        };
        observerable.register(observer1);
        observerable.register(observer2);

        observerable.update("success!!!");
    }
}
