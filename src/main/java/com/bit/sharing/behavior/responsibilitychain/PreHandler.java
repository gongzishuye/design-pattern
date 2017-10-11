package com.bit.sharing.behavior.responsibilitychain;

/**
 * @author chen lu
 * @date 2017/10/10
 * @time 22:06
 */
public class PreHandler extends Handler {

    @Override
    public void processRequest(Request request) {
        System.out.println("First handler.");

        getSuccessor().processRequest(request);
    }
}
