package item.difficulty.easy;

/**
 * 题目描述：移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 * @author zhangzhl
 *
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
    	
    	while(head != null && head.data == val) {
    		ListNode delnode = head;
    		head = head.next;
    		delnode.next = null;
    	}
    	if(head == null) {
    		return null;
    	}
    	ListNode pre = head;
    	while(pre.next != null) {
    		if(pre.next.data == val) {
    			ListNode delnode = pre.next;
    			pre.next = pre.next.next;
        		delnode.next = null;
    		} else {
    			pre = pre.next;
    		}
    	}
		return head;

    }
}
