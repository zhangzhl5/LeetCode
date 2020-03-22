package item.difficulty.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 945 题目描述：使数组中唯一的最小增量
 * 
 * @author zhangzhl
 *
 */
public class MinIncrementForUnique {

	public int minIncrementForUnique(int[] A) {
		// 用map的话会超出时间限制
//		Map<Integer, Integer> times = new HashMap<Integer, Integer>();
		int[] res = new int[40002];
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Arrays.sort(A);
		int moves = 0;
		for (int s : A) {
			res[s]++;
		}
		
		for (int j = 0; j < res.length;j++) {
			if(res[j] > 1) {
				for(int i = 1;i < res[j];i++) {
					nums.add(j);
				}
			}
		}
		for (int x = 0 ; x < nums.size();x++) {
			int index = nums.get(x);
			while (res[index] >= 1) {
				index++;
				moves++;
			}
			res[nums.get(x)]--;
			res[index]++;
			
		}
		return moves;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 1, 7 };
		MinIncrementForUnique u = new MinIncrementForUnique();
		int res = u.minIncrementForUnique(arr);
		System.out.println(res);
	}

}
