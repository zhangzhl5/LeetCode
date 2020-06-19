package item.topic.thread;

import java.util.List;

public class SumThread extends Thread {
	
	private List<Integer> list;
	private Integer begin;
	private Integer end;
	private Integer sum;

	@Override
	public void run() {
		for(int i = 0;i < list.size();i++) {
			sum+=list.get(i);
		}
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
	

}
