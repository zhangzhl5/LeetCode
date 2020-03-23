package item.difficulty.easy;

/**
 * 876 题目描述：链表的中间节点
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 */
public class MiddleNode {
	
    /**
     * 思路：快满指针的方式，快指针是慢指针的两倍速，当快指针走到尾时 慢指针刚好走到中部
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
    	   ListNode low = head, fast = head;
           while (fast != null && fast.next != null) {
        	   fast = fast.next.next;
        	   low = low.next;
           }
           return low;
    }
    
    /**
            * 思路：获取链表的长度size，找到遍历的次数为 size/2
     * @param head
     * @return
     */
    public ListNode middleNode2(ListNode head) {
    	   int index = 1;
    	   ListNode temp = head;
           while (head.next != null) {
        	   head = head.next;
        	   index++;
           }
           index = index/2+1;
           while(index > 1) {
        	   temp = temp.next;
        	   index--;
           }
           return temp;
    }
}
