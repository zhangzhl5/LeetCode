package com.zhangzhl.invoke;
import java.lang.reflect.Method;

public class TestNew {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.zhangzhl.invoke.Student");
		//����ʵ������
		Object o = c.newInstance();
		//��÷�������
		Method m = c.getDeclaredMethod("study");
		//���÷����ķ���Ȩ��
		m.setAccessible(true);
		//ִ�ж���ķ���
		m.invoke(o,args);
	}
}
