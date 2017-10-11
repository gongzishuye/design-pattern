package com.bit.sharing.behavior.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author chen lu
 * @date 2017/10/11
 * @time 16:18
 */
public class Observerable {
    private List<Observer> observers;

    public Observerable() {
        this.observers = new LinkedList<Observer>();
    }

    public synchronized void register(Observer observer) {
        observers.add(observer);
    }

    public synchronized void remove(Observer observer) {
        observers.remove(observer);
    }

    public void update(Object arg) {
        for(Observer obs: observers) {
            obs.update(arg);
        }
    }
}
