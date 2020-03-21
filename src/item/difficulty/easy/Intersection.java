package item.difficulty.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 349 题目描述：两个数组的交集
 * 考察集合map
 * @author zhangzhl
 *
 */
public class Intersection {
	
    public int[] intersection(int[] nums1, int[] nums2) {
    	if(nums1.length < 1 || nums2.length < 1) {
    		return null;
    	}
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0 ; i < nums1.length ;i++) {
    		map.put(nums1[i], 1);
    	}
    	for(int num : nums2) {
    		if(map.containsKey(num)) {
    			set.add(num);
    		}
    	}
    	int[] res = new int[set.size()];
    	int index = 0;
    	for(Integer s : set) {
    		res[index++] = s;
    	}
		return res;

    }

}
