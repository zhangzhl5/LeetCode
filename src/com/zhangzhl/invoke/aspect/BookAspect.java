package com.zhangzhl.invoke.aspect;


import java.util.Date;

public class BookAspect {
    public static BookAspect getInstance(){
        return new BookAspect();
    }

    public void checkPermission(){
        System.out.println("检查权限");
    }

    public void log (){
        System.out.println("打印时间"+new Date());
    }
}
