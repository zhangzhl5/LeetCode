package item.difficulty.easy;

import java.util.LinkedList;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，
 * 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * @author zhangzhl
 *
 */
public class MaxQueue {

	// 双端队列
	// 引入一个队列维护最大值
	private LinkedList<Integer> queue;
	private LinkedList<Integer> maxlist;

	public MaxQueue() {
		this.queue = new LinkedList<Integer>();
		this.maxlist = new LinkedList<Integer>();
	}

	public int max_value() {
		return queue.isEmpty() ? -1 : maxlist.peek();
	}

	public void push_back(int value) {
		queue.offer(value);
		// 只要最大值队列不为空，并且新添加的数据只要不大于目前最大值队列中的数据就不会更新最大值队列
		// 当有新的最大值出现时将最大值队列小于该值得数据移除
		// 因为出队列是按照先进先出的原则只要队列不是空，就不会造成最大值的返回值为空的现象
		while(!maxlist.isEmpty() && value > maxlist.peekLast()) {
			maxlist.pollLast();
		}
		maxlist.offerLast(value);
	}

	public int pop_front() {
		if(queue.isEmpty()) {
            return -1;
        }
		int val = queue.pop();
		// 当出队列的值和当前最大值想同时 同步移除最大值队列中的最大值
		if(maxlist.peek() == val) {
			maxlist.poll();
		}
		return val;

	}

}
