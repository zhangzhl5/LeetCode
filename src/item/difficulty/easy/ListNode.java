package com.zhangzhl.title;

/**
 * 定义一个链表
 */
public class ListNode {

	// 存放数据的变量，简单点，直接为int型
	int data;
	// 存放结点的变量,默认为null
	ListNode next;
	
	ListNode(int data) {
		this.data = data;
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public int getdata() {
		return this.data;
	}

	public void addNode(int newdata) {
		ListNode newNode = new ListNode(newdata);
		if (this.next == null) {
			this.next = newNode;
		} else {
			this.next.addNode(newdata);
		}
	}

	// 输出
	public void print() {
		System.out.print(this.data + "-->");
		if (this.next != null) {
			this.next.print();
		}
	}

}
