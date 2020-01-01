package com.zhangzhl.title;

/*
 * ��������������ϲ�Ϊһ���µ�������������
 * ��������ͨ��ƴ�Ӹ�����������������нڵ���ɵ�
 */
public class MergeTwoLists {

	public static void main(String[] args) {
		// mergeTwoLists();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// ��ʼ��һ��ͷ���
		ListNode rspHead = new ListNode(0);
		// ��ͷ�ڵ㸳ֵ��rsp
		ListNode rsp = rspHead;
		// ����������ĵ������Ӧ��ͷ����ֵ����Ϊ��ʱ����ѭ������
		while (l1 != null && l2 != null) {
			// ���L1�����ͷ����ֵС��L2 ����ʼ���Ľڵ�nextָ��ָ��L1��ֵ��Ȼ��ͷ������һ���ڵ���Ϊͷ���������б���
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
