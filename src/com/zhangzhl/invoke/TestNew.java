package com.zhangzhl.invoke;
import java.lang.reflect.Method;

public class TestNew {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.zhangzhl.invoke.Student");
		//创建实例对象
		Object o = c.newInstance();
		//获得方法对象
		Method m = c.getDeclaredMethod("study");
		//设置方法的访问权限
		m.setAccessible(true);
		//执行对象的方法
		m.invoke(o,args);
	}
}
