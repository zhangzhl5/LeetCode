package item.difficulty.medium;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1226. 哲学家进餐
 * @author Administrator
 *
 */
public class DiningPhilosophers {
	
	//1个Fork视为1个ReentrantLock，5个叉子即5个ReentrantLock，将其都放入数组中
		private ReentrantLock[] lockList = {
			new ReentrantLock(),
			new ReentrantLock(),
			new ReentrantLock(),
			new ReentrantLock(),
			new ReentrantLock()};
	    
	    //限制 最多只有4个哲学家去持有叉子
		private Semaphore eatLimit = new Semaphore(3);

		public DiningPhilosophers() {

		}

		// call the run() method of any runnable to execute its code
		public void wantsToEat(int philosopher,
			Runnable pickLeftFork,
			Runnable pickRightFork,
			Runnable eat,
			Runnable putLeftFork,
			Runnable putRightFork) throws InterruptedException {
	        
			int rightFork = (philosopher + 1) % 5;	//右边的叉子 的编号
			int leftFork = philosopher;	//左边的叉子 的编号

			eatLimit.acquire();	//限制的人数 -1

			lockList[leftFork].lock();	//拿起左边的叉子
			lockList[rightFork].lock();	//拿起右边的叉子
			pickLeftFork.run();	//拿起左边的叉子 的具体执行
			pickRightFork.run();	//拿起右边的叉子 的具体执行
			eat.run();	//吃意大利面 的具体执行
			putLeftFork.run();	//放下左边的叉子 的具体执行
			putRightFork.run();	//放下右边的叉子 的具体执行
			lockList[leftFork].unlock();	//放下左边的叉子
			lockList[rightFork].unlock();	//放下右边的叉子
			eatLimit.release();//限制的人数 +1
		}
}
