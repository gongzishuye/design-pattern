package com.bit.sharing.behavior.template;

/**
 * @author chen lu
 * @date 2017/10/11
 * @time 22:29
 */
public class Realization extends Template {
    @Override
    void before() {
        System.out.println("int the before..");
    }

    @Override
    void after() {
        System.out.println("int the after..");
    }
}
