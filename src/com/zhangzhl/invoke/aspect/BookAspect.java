package com.zhangzhl.invoke.aspect;


import java.util.Date;

public class BookAspect {
    public static BookAspect getInstance(){
        return new BookAspect();
    }

    public void checkPermission(){
        System.out.println("���Ȩ��");
    }

    public void log (){
        System.out.println("��ӡʱ��"+new Date());
    }
}
