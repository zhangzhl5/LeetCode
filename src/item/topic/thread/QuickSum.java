package item.topic.thread;

import java.util.List;

public class QuickSum {
	
	public Integer quickSum(List<Integer> list,int len) {
		
		Integer sum = Integer.valueOf(0);
		
			int threadNum = list.size()/len;
			for(int j = 0;j < threadNum;j++) {
				SumThread sumThreads = new SumThread();
				if(j == threadNum-1) {
					sumThreads.setList(list);
					sumThreads.setBegin(len*j);
					sumThreads.setEnd(list.size()-len*j-1);
					sumThreads.start();
					Integer threadSum = sumThreads.getSum();
					sum+=threadSum;
				} else {
				
					sumThreads.setList(list);
					sumThreads.setBegin(len*j);
					sumThreads.setEnd(len*j+len-1);
					sumThreads.start();
					Integer threadSum = sumThreads.getSum();
					sum+=threadSum;
				}
			}
		return sum;
	}

}
