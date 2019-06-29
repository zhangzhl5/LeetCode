package com.zhangzhl.invoke.test;

import com.zhangzhl.invoke.BookDaoImpl;

import java.lang.reflect.Method;

public class TestInvok {
    public static void main(String[] args) {
        BookDaoImpl bookDao = new BookDaoImpl();
        try {
            // ��ȡָ������ ͨ�����÷����������Լ������÷����Ĳ�����Class������String.class
            Method methods = bookDao.getClass().getMethod("addBook", String.class);

            methods.invoke(bookDao, "java���˼��");
            // ��ȡ���е�public����
            Method[] method = bookDao.getClass().getMethods();
            for (Method m : method) {
                if (m.getName().equals("addBook")) {
                    m.invoke(bookDao, "java���˼��");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
