package item.topic.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * 5370. 设计地铁系统
 * 1. checkIn(int id, string stationName, int t) 编号为 id 的乘客在 t 时刻进入地铁站 stationName 。一个乘客在同一时间只能在一个地铁站进入或者离开。
 * 2. checkOut(int id, string stationName, int t) 编号为 id 的乘客在 t 时刻离开地铁站 stationName 。 
 * 3. getAverageTime(string startStation, string endStation) 返回从地铁站 startStation 到地铁站 endStation 的平均花费时间。 
 * 平均时间计算的行程包括当前为止所有从 startStation 直接到达 endStation 的行程。 调用 getAverageTime 时，询问的路线至少包含一趟行程。
 * 你可以假设所有对 checkIn 和 checkOut 的调用都是符合逻辑的。也就是说，如果一个顾客在 t1 时刻到达某个地铁站，那么他离开的时间 t2 一定满足 t2 > t1 。
 * 所有的事件都按时间顺序给出
 * @author zhangzhl
 *
 */
public class UndergroundSystem {

	
	public class Node{
		double starttime ;
		double endtime ;
		String startStation;
		String endStation;
		public Node() {
			
		}
	}
	
	Map<Integer,Node> map;
	public UndergroundSystem() {
		map = new HashMap<Integer,Node>();
	}

	public void checkIn(int id, String stationName, int t) {
		if(map.containsKey(id)) {
			map.get(id).startStation = stationName;
			map.get(id).starttime = t;
		} else {
			Node node = new Node();
			node.startStation = stationName;
			node.starttime = t;
			map.put(id, node);
		}
	}

	public void checkOut(int id, String stationName, int t) {
		if(map.containsKey(id)) {
			map.get(id).endStation = stationName;
			map.get(id).endtime = t;
		} else {
			Node node = new Node();
			node.endStation = stationName;
			node.endtime = t;
			map.put(id, node);
		}
	}
	
	public double getAverageTime(String startStation, String endStation) {
		int num = 1;
		double times = 0.0d;
		for(Integer i :map.keySet()) {
			Node node = map.get(i);
			if(startStation.equals(node.startStation) && endStation.equals(node.endStation)) {
				num++;
				times = times + (node.endtime-node.starttime);
			}
		}
		return times/num;

	}
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t); obj.checkOut(id,stationName,t); double param_3
 * = obj.getAverageTime(startStation,endStation);
 */
