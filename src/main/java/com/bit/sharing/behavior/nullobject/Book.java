package com.bit.sharing.behavior.nullobject;

/**
 * @author chen lu
 * @date 2017/10/12
 * @time 22:38
 */
public class Book {
    private String name;

    private int bookId;

    public Book(String name, int bookId) {
        this.name = name;
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
