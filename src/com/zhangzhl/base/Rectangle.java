package com.zhangzhl.base;

import java.io.Serializable;

/**
 * Java��transient�ؼ��ֵ����ã��򵥵�˵��������ĳЩ�����εĳ�Ա���Ա����������л���
 * ��һ������ܺ���⣬���ǲ������л�����ôʲô����£�һ�������ĳЩ�ֶβ���Ҫ�����л��أ�
 * �����������������Կ���ʹ�ùؼ���transient���Σ�
 * 1�����е��ֶ�ֵ���Ը��������ֶ��Ƶ���������һ�������������������ԣ����ȡ���ȡ������ʾ�����ѣ�һ�㲻��������ƣ���
 * ��ô�����л���ʱ�����������Ծ�û��Ҫ�����л��ˣ�
 */
class Rectangle implements Serializable {

	private static final long serialVersionUID = 1710022455003682613L;
	private Integer width;
	private Integer height;
	// ���γ�Ա�����������л�
	private transient Integer area;

	public Rectangle(Integer width, Integer height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}

	public void setArea() {
		this.area = this.width * this.height;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(40);
		sb.append("width : ");
		sb.append(this.width);
		sb.append("\nheight : ");
		sb.append(this.height);
		sb.append("\narea : ");
		sb.append(this.area);
		return sb.toString();
	}
}
