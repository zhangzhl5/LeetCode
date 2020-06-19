package item.topic.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class QuickSum {

	public Integer quickSum(List<Integer> list, int len) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);  
		List<FutureTask<Integer>> taskList = new ArrayList<>();
		Integer sum = Integer.valueOf(0);
		while(list.size() > 0){
			 synchronized (list) {
				 List<Integer> res = list.subList(0, len-1);
				 FutureTask<Integer> task = new FutureTask<Integer>(new Sum(res));
				 taskList.add(task);
				 fixedThreadPool.execute(task);
			 }
        }
		sum= taskListSum(taskList);
	    return sum;
	}

	private Integer taskListSum(List<FutureTask<Integer>> taskList) {
		int sum = 0;
		for (FutureTask<Integer> task : taskList) {
			try {
				sum += task.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}
