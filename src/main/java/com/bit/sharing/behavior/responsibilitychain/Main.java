package com.bit.sharing.behavior.responsibilitychain;

/**
 * @author chen lu
 * @date 2017/10/10
 * @time 22:08
 */
public class Main {
    public static void main(String[] args) {
        //构建preHandler，获取链首的对象
        PreHandler preHandler = new PreHandler();
        SecondHandler secondHandler = new SecondHandler();
        preHandler.setSuccessor(secondHandler);

        Request request = new Request();
        preHandler.processRequest(request);
    }
}
