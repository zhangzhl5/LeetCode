package item.difficulty.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 914. 卡牌分组
 * @author zhangzhl
 *
 */
public class HasGroupsSizeX {
	
    public boolean hasGroupsSizeX(int[] deck) {
    	if(deck.length < 2) {
    		return false;
    	}
    	Map<Integer,Integer> nums = new HashMap<Integer,Integer>();
    	for(int n : deck) {
    		if(nums.containsKey(n)) {
    			nums.put(n, nums.get(n)+1);
    		} else {
    			nums.put(n, 1);
    		}
    	}
    	List<Integer> arr = new ArrayList<Integer>();
    	for(int s : nums.values()) {
    		arr.add(s);
    	}
    	  // 求gcd
        int x = -1;
        for(int ctn : arr) {
        	x = x == -1 ? ctn:gcd(x,ctn);
        	
        	if(x == 1) {
        		return false;
        	}
        	
        }
        return x >= 2;

    }

    private int gcd (int a,int b) {
    	return b == 0 ? a : gcd(b ,a % b);
    }
}
