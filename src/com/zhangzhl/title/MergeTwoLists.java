package com.zhangzhl.title;

/*
 * 将两个有序链表合并为一个新的有序链表并返回
 * 新链表是通过拼接给定的两个链表的所有节点组成的
 */
public class MergeTwoLists {

	public static void main(String[] args) {
		// mergeTwoLists();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// 初始化一个头结点
		ListNode rspHead = new ListNode(0);
		// 将头节点赋值给rsp
		ListNode rsp = rspHead;
		// 当两个有序的单链表对应的头结点的值都不为空时进行循环遍历
		while (l1 != null && l2 != null) {
			// 如果L1链表的头结点的值小于L2 将初始化的节点next指针指向L1的值，然后头结点的下一个节点作为头结点继续进行遍历
			if (l1.data < l2.data) {
				rspHead.next = l1;
				
				l1 = l1.next;
			} else {
				rspHead.next = l2;
				l2 = l2.next;
			}
			rspHead = rspHead.next;
		}
		if (l1 == null) {
			rspHead.next = l2;
		} else {
			rspHead.next = l1;
		}
		return rsp.next;
	}
}
