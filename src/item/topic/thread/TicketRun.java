package item.topic.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TicketRun {
	
	public static void main(String[] args) {
		
		 SealTiceket  t = new SealTiceket();
		 FutureTask<Integer> task = new FutureTask<Integer>(t);
		 FutureTask<Integer> task2 = new FutureTask<Integer>(t);
		 Thread thread1 = new Thread(task);
		 Thread thread2 = new Thread(task);
		 thread1.start();
		 thread2.start();
		 try {
			System.out.println("任务一"+task.get());
			System.out.println("任务二"+task2.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
