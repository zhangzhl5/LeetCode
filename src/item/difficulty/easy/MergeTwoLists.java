package item.difficulty.easy;


public class MergeTwoLists {

	public static void main(String[] args) {
		// mergeTwoLists();
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode rspHead = new ListNode(0);
		ListNode rsp = rspHead;
		while (l1 != null && l2 != null) {
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
