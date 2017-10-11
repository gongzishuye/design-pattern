package com.bit.sharing.behavior.Template;

/**
 * @author chen lu
 * @date 2017/10/11
 * @time 22:26
 */
public abstract class Template {

    abstract void before();

    void middle() {
        System.out.println("in the middle...");
    }

    abstract void after();

    public final void flow() {
        before();
        middle();
        after();
    }
}
