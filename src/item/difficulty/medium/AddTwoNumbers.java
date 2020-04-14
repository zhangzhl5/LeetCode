package item.difficulty.medium;

/**
 * 445. 两数相加 II
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。
 * 它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头
 * @author zhangzhl
 *
 */
public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 反转链表
		if (l1 == null) return l2;
	    if (l2 == null) return l1;
		l1  = reverseListNode(l1);
		l2  = reverseListNode(l2);
		int upnum = 0;
	    ListNode newHead = new ListNode(0);
	    ListNode curr = newHead;
	    while (l1 != null || l2 != null){
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int num = (x + y + upnum) % 10;
            ListNode node = new ListNode(num);
            curr.next = node;
            curr = node;
            upnum = (x + y + upnum) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2  = l2.next;
        }
        // 最后加上 carry
        if (upnum > 0) curr.next = new ListNode(upnum);
        ListNode res = reverseListNode(newHead.next);
        return res;
	}

	private ListNode reverseListNode(ListNode head) {
		if (head == null)
			return null;
		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}
