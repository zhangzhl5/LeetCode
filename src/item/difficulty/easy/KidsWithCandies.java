package item.difficulty.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1431. 拥有最多糖果的孩子
 * @author zhangzhl
 *
 */
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	int max = 0;
    	for(int i = 0;i < candies.length;i++) {
    		max = Math.max(max, candies[i]);
    	}
    	List<Boolean> res = new ArrayList<Boolean>();
    	for(int j = 0;j < candies.length; j++) {
    		res.add(candies[j] >= max - extraCandies);
    	}
		return res;
    }
    
    public static void main(String[] args) {
    	KidsWithCandies kidsWithCandies= new KidsWithCandies();
    	int[] cndies = {2,3,5,1,3};
    	int extraCandies = 3;
    	System.out.println(kidsWithCandies.kidsWithCandies(cndies, extraCandies));
	}
}
