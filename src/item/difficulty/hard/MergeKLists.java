package item.difficulty.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. 合并K个排序链表
 * @author zhangzhl
 *
 */
public class MergeKLists {
	
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	 /**
	  * 用容量为K的最小堆优先队列，把链表的头结点都放进去，然后出队当前优先队列中最小的，挂上链表
	  * 然后让出队的那个节点的下一个入队，再出队当前优先队列中最小的，直到优先队列为空
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
	        if (lists.length == 0) {
	            return null;
	        }

	        ListNode dummyHead = new ListNode(0);
	        ListNode curr = dummyHead;
	        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
	            @Override
	            public int compare(ListNode o1, ListNode o2) {
	                return o1.val - o2.val;
	            }
	        });

	        for (ListNode list : lists) {
	            if (list == null) {
	                continue;
	            }
	            pq.add(list);
	        }

	        while (!pq.isEmpty()) {
	            ListNode nextNode = pq.poll();
	            curr.next = nextNode;
	            curr = curr.next;
	            if (nextNode.next != null) {
	                pq.add(nextNode.next);
	            }
	        }
	        return dummyHead.next;
	    }

}
