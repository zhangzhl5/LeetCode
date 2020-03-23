package item.difficulty.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 347 题目描述：前K哥频次最高的元素
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 通过优先队列维护前K个最大的元素
 * @author zhangzhl
 *
 */
public class TopKFrequent {
	
	private class Freq implements Comparable<Freq>{

        public int e, freq;

        public Freq(int e, int freq){
            this.e = e;
            this.freq = freq;
        }

        public int compareTo(Freq another){
            if(this.freq < another.freq)
                return -1;
            else if(this.freq > another.freq)
                return 1;
            else
                return 0;
        }
    }
	
    public List<Integer> topKFrequent(int[] nums, int k) {
    	
    	Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
    	
    	for(int num : nums) {
        	if(map.containsKey(num)) {
        		map.put(num, map.get(num)+1);
        	} else {
        		map.put(num, 1);
        	}
    	}
    	 PriorityQueue<Freq> pq = new PriorityQueue<>();
         for(int key: map.keySet()){
             if(pq.size() < k)
                 pq.add(new Freq(key, map.get(key)));
             else if(map.get(key) > pq.peek().freq){
                 pq.remove();
                 pq.add(new Freq(key, map.get(key)));
             }
         }

         LinkedList<Integer> res = new LinkedList<>();
         while(!pq.isEmpty())
             res.add(pq.remove().e);
         return res;

    }

}
