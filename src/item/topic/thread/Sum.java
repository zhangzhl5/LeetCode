package item.topic.thread;

import java.util.List;
import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
	
	private List<Integer> list;
	
	public Sum(List<Integer> list){
         this.list = list;
    }
	
	@Override
	public Integer call() throws Exception {
		Integer sum = 0;
		for(int i = 0;i < list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}
	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

}
