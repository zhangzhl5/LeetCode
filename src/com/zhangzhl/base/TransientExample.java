package com.zhangzhl.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л�Ч��չʾ
 */
public class TransientExample{
	
    public static void main(String args[]) throws Exception {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("1.ԭʼ����\n"+rectangle);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("rectangle"));
        // ����д�����
        o.writeObject(rectangle);
        o.close();

        // ������ȡ����
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("rectangle"));
        Rectangle rectangle1 = (Rectangle)in.readObject();
        System.out.println("2.�����л���Ķ���\n"+rectangle1);
        rectangle1.setArea();
        System.out.println("3.�ָ���ԭʼ����\n"+rectangle1);
        in.close();
    }
}
