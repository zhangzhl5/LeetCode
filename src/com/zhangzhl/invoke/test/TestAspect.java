package com.zhangzhl.invoke.test;

import com.zhangzhl.invoke.BookDao;
import com.zhangzhl.invoke.BookDaoImpl;
import com.zhangzhl.invoke.DynProxyImpl;

public class TestAspect {

    public static void main(String[] args){
        DynProxyImpl dynProxy = new DynProxyImpl();
        BookDao bookDao = new BookDaoImpl();
//        BookDao bookDao1 = (BookDao)dynProxy.creatProxy(bookDao);
//        bookDao1.addBook("java");
//        bookDao1.sendBook(0);
//        bookDao1.deletBook("java");
    }
}
