package item.difficulty.easy;

/**
 * 83 题目描述：删除排序链表中的重复元素
 * @author Administrator
 *
 */
public class DeleteDuplicates {
	

	 public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int x) { val = x; }
	  }

    public ListNode deleteDuplicates(ListNode head) {
    	
    	if(head == null || head.next == null) {
    		return head;
    	}
    	if(head.val == head.next.val) {
    		head = deleteDuplicates(head.next);
    	} else {
    		head.next = deleteDuplicates(head.next);
    	}
    	return head;

    }

}
