package item.difficulty.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续正数序列 
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * 
 * @author zhangzhl
 *
 */
public class FindContinuousSequence {
	
	

	public int[][] findContinuousSequence(int target) {
// 	   target如果为复数直接返回空
//     输入10 ； 输出[[1,2,3,4]] 
//		if ((target % 2) == 0 || target <= 2) {
//			return null;
//		}
		List<int[]> list = new ArrayList<int[]>();

		for (int l = 1, r = 1, sum = 0; r <= (target + 1) / 2; r++) {
			sum += r;
			while (sum > target) {
				sum = sum - l;
				l++;
			}
			if (sum == target) {
				int[] temp = new int[r - l + 1];
				for (int i = 0; i < temp.length; i++) {
					temp[i] = l + i;
				}
				list.add(temp);
			}
		}
		int[][] result = new int[list.size()][];
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		return result;

	}

}
