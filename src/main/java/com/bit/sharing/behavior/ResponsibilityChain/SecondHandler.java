package com.bit.sharing.behavior.ResponsibilityChain;

/**
 * @author chen lu
 * @date 2017/10/10
 * @time 22:06
 */
public class SecondHandler extends Handler {
    @Override
    public void processRequest(Request request) {
        System.out.println("Second handler.");
    }
}
