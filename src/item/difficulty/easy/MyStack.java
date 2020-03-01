package item.difficulty.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列的特性是先进先出 栈的特性是先进后出 
 * 
 * offer，add 区别： 一些队列有大小限制，因此如果想在一个满的队列中加入一个新项，多出的项就会被拒绝。 这时新的 offer
 * 方法就可以起作用了。它不是对调用 add() 方法抛出一个 unchecked 异常，而只是得到由 offer() 返回的 false。
 * poll，remove 区别： remove() 和 poll() 方法都是从队列中删除第一个元素。remove() 的行为与 Collection
 * 接口的版本相似， 但是新的 poll() 方法在用空集合调用时不是抛出异常，只是返回 null。因此新的方法更适合容易出现异常条件的情况。
 * peek，element区别： element() 和 peek() 用于在队列的头部查询元素。与 remove() 方法类似，在队列为空时，
 * element() 抛出一个异常，而 peek() 返回 null。
 * 
 */
public class MyStack {
	

	private Queue<Integer> inqueue;
	private Queue<Integer> outqueue;

	/** Initialize your data structure here. */
	public MyStack() {
		this.inqueue = new LinkedList<Integer>();
		this.outqueue = new LinkedList<Integer>();
	}
	
	/**
	 * 你只能使用队列的基本操作--也就是 push to back, peek/pop from front,
	 * size, 和 isempty 这些操作是合法的。 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 ，
	 * 只要是标准的队列操作即可。 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
	/** Push element x onto stack. */
	public void push(int x) {
		inqueue.offer(x);
		// 保持输入队列一直是空的 加入一个元素就讲队列中的元素颠倒一次
		while(!outqueue.isEmpty()) {
			inqueue.offer(outqueue.poll());
		}
		Queue  temp = inqueue;
		inqueue = outqueue;
		outqueue = temp;
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		return outqueue.poll();

	}

	/** Get the top element. */
	public int top() {
		return outqueue.element();

	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return outqueue.isEmpty();
	}
}
