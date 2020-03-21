package item.difficulty.easy;

import java.util.ArrayList;
import java.util.TreeMap;

public class Intersect {
	
    public int[] intersect(int[] nums1, int[] nums2) {
    	TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
    	for(int  n : nums1 ) {
    		if(map.containsKey(n)) {
    			map.put(n, map.get(n)+1);
    		} else {
    			map.put(n,1);
    		}
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int s : nums2) {
    		if(map.containsKey(s)) {
    			list.add(s);
    			map.put(s, map.get(s)-1);
    			if(map.get(s) == 0) {
    				map.remove(s);
    			}
    		}
    	}
    	int[] res = new int[list.size()];
    	for(int i = 0; i < list.size();i++) {
    		res[i] = list.get(i);
    	}
		return res;
    }

}
