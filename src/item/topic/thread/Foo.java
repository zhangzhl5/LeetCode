package item.topic.thread;

public class Foo {

	private boolean firstFinished;
	private boolean secondFinished;
	// 对象锁实现线程执行顺序控制
	Object lock = new Object();

	public Foo() {

	}

	public void first(Runnable printFirst) throws InterruptedException {

		// printFirst.run() outputs "first". Do not change or remove this line.
		synchronized (lock) {
			printFirst.run();
			firstFinished = true;
			lock.notifyAll();
		}
	}

	public void second(Runnable printSecond) throws InterruptedException {
		synchronized (lock) {
			while (!firstFinished) {
				lock.wait();
			}
			// printSecond.run() outputs "second". Do not change or remove this line.
			printSecond.run();
			secondFinished = true;
			lock.notifyAll();

		}
	}

	public void third(Runnable printThird) throws InterruptedException {
		synchronized (lock) {
			while (!secondFinished) {
				lock.wait();
			}
			// printSecond.run() outputs "second". Do not change or remove this line.
			printThird.run();
		}
	}

}
