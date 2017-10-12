package com.bit.sharing.behavior.nullobject;

/**
 * @author chen lu
 * @date 2017/10/12
 * @time 22:37
 */
public class Main {

    public static void main(String[] args) {
        getBookById(3).toString();
    }

    private static Book getBookById(int id) {
        if(id == 1) {
            return new Book("dubbo", 1);
        } else if(id == 2) {
            return new Book("thrift", 2);
        } else {
            return new Book("null", 3);
        }

    }
}
