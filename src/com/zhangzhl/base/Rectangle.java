package com.zhangzhl.base;

import java.io.Serializable;

/**
 * Java中transient关键字的作用，简单地说，就是让某些被修饰的成员属性变量不被序列化，
 * 这一看好像很好理解，就是不被序列化，那么什么情况下，一个对象的某些字段不需要被序列化呢？
 * 如果有如下情况，可以考虑使用关键字transient修饰：
 * 1、类中的字段值可以根据其它字段推导出来，如一个长方形类有三个属性：长度、宽度、面积（示例而已，一般不会这样设计），
 * 那么在序列化的时候，面积这个属性就没必要被序列化了；
 */
class Rectangle implements Serializable {

	private static final long serialVersionUID = 1710022455003682613L;
	private Integer width;
	private Integer height;
	// 修饰成员变量不被序列化
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
