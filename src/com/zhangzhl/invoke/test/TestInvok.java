package com.zhangzhl.invoke.test;

import com.zhangzhl.invoke.BookDaoImpl;

import java.lang.reflect.Method;

public class TestInvok {
    public static void main(String[] args) {
        BookDaoImpl bookDao = new BookDaoImpl();
        try {
            // 获取指定方法 通过调用方法的名字以及被调用方法的参数的Class类型如String.class
            Method methods = bookDao.getClass().getMethod("addBook", String.class);

            methods.invoke(bookDao, "java编程思想");
            // 获取所有的public方法
            Method[] method = bookDao.getClass().getMethods();
            for (Method m : method) {
                if (m.getName().equals("addBook")) {
                    m.invoke(bookDao, "java编程思想");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
