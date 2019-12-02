package com.zhangzhl.title;

/**
 * 给出两个非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 初始化一个头结点
		ListNode rspHead = new ListNode((l1.val + l2.val) % 10);
		// 将头节点赋值给rsp
		ListNode rsp = rspHead;
		int preval = (l1.val + l2.val) / 10;
		// 当两个有序的单链表对应的头结点的值都不为空时进行循环遍历
		while (l1.next != null) {
			if (l2.next != null) {
				int val = l1.next.val + l2.next.val + preval;
				rsp.next = new ListNode(val % 10);
				preval = val / 10;
				l1 = l1.next;
				l2 = l2.next;
				rsp = rsp.next;
			} else {
				int val = l1.next.val + preval;
				rsp.next = new ListNode(val % 10);
				preval = val / 10;
				l1 = l1.next;
				rsp = rsp.next;
			}
		}
		while (l2.next != null) {
			int val = l2.next.val + preval;
			rsp.next = new ListNode(val % 10);
			preval = val / 10;
			l2 = l2.next;
			rsp = rsp.next;
		}
		if (preval != 0) {
			rsp.next = new ListNode(1);
		}
		return rspHead;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
	}
}