package com.bit.sharing.behavior.ResponsibilityChain;

/**
 * @author chen lu
 * @date 2017/10/10
 * @time 22:03
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void processRequest(Request request);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
