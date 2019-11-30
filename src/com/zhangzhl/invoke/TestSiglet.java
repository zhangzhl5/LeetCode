package com.zhangzhl.invoke;
public class TestSiglet {
	public static void main(String[] args) {
		User u1 = User.getUser();
		User u2 = User.getUser();
		System.out.println(u1==u2);
	}
}
//饿汉式
/*class User{
	private static final User u = new User();
	private User(){}
	public static User getUser(){
		return u;
	}
}*/
//懒汉是
class User{
	private static User u;
	private User(){}
	public static synchronized User getUser(){//类对象的锁
		if(u==null){
			u = new User();
		}
		return u;
	}
}



