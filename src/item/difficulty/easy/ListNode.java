package item.difficulty.easy;

public class ListNode {

	int data;
	ListNode next;
	
	ListNode(int data) {
		this.data = data;
	}

	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public int getdata() {
		return this.data;
	}

	public void addNode(int newdata) {
		ListNode newNode = new ListNode(newdata);
		if (this.next == null) {
			this.next = newNode;
		} else {
			this.next.addNode(newdata);
		}
	}

	public void print() {
		System.out.print(this.data + "-->");
		if (this.next != null) {
			this.next.print();
		}
	}

}
