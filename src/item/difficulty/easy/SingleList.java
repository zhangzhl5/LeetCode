package item.difficulty.easy;

public class SingleList {

	private ListNode header;
	private ListNode tail;
	private int size;

	public SingleList() {
		this.header = null;
		this.tail = null;
	}

	public SingleList(int element) {

		header = new ListNode(element, null);
		tail = header;
		size++;
	}

	public void addHeadNode(int data) {
		ListNode newNode = new ListNode(data, null);
		newNode.next = header;
		header = newNode;
		if (tail == null) {
			tail = header;
		}

		size++;
	}

	public void add(int element) {

		if (header == null) {
			header = new ListNode(element, null);
			tail = header;
		} else {
			ListNode newNode = new ListNode(element, null);
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public void delete(int data) {

	}

	public int length() {
		return size;
	}
}
