package item.difficulty.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
    	TreeSet arr = new TreeSet<Integer>();
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0 ; i < nums1.length ;i++) {
    		arr.add(nums1[i]);
    	}
    	for(int num : nums2) {
    		if(arr.contains(num)) {
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
