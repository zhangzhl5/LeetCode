package com.zhangzhl.invoke;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class TestClass {
	public static void main(String[] args) throws Exception{
		Student s = new Student();
		Class c1 = s.getClass();
		Class c2 = Student.class;
		Class c3 = Class.forName("com.zhangzhl.invoke.Student");
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c1.getSuperclass().getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getName());
		System.out.println("=================����==============");
//		Field[] fs = c1.getFields();
		Field[] fs = c1.getDeclaredFields();//����˽������
		for(Field f:fs){
			System.out.println(f.getName()+"\t"+f.getType());
		}
		System.out.println("============����==================");
//		Method[] ms = c1.getMethods();
		Method[] ms = c1.getDeclaredMethods();//����˽�з���
		for(Method m:ms){
			System.out.println(m.getName()+"\t"+m.getParameterTypes().length+"\t"+m.getReturnType());
		}
		System.out.println("============���췽��==========");
		Constructor[] cs = c1.getConstructors();
		System.out.println(cs.length);
		System.out.println("==========�ӿ�=============");
		Class[] interfaces = c1.getInterfaces();
		System.out.println(interfaces[0].getSimpleName());
	}
}








