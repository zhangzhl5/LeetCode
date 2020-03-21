package item.difficulty.easy;


/**
 * 面试题24：反转链表
 * 反转一个单链表。
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {

	 public ListNode reverseList(ListNode head) {
		 ListNode prev = null; //前指针节点
	     ListNode curr = head; //当前指针节点
	     //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
		 while(curr != null) {
			 ListNode nextTemp = curr.next;
			 // 将当前节点的next之前前一个节点，反转过程
			 curr.next = prev;
			 // 后移一个节点
			 prev = curr;
			 curr = nextTemp;
		 }
		 // 当前指针节点为空时说明已经到链表尾部的节点的next指针处
		return prev;
	        
	 }
}
