package com.zhangzhl.invoke;


import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    List<String> bookList = new ArrayList<String>();
    @Override
    public void addBook(String bookName) {
        bookList.add(bookName);
        System.out.println(bookName);
    }

    @Override
    public void deletBook(String bookName) {
        bookList.remove(bookList);
    }

    @Override
    public void sendBook(int bookName) {
        bookList.get(bookName);
    }
}
