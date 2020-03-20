package item.difficulty.easy;

import java.util.Arrays;

/**
 * 题目描述：最小的k 个数
 * 
 * @author Administrator
 *
 */
public class GetLeastNumbers {

	/**
	 * 此问题主要考察的排序算法
	 * @param arr
	 * @param k
	 * @return
	 */
	public int[] getLeastNumbers(int[] arr, int k) {

		Arrays.sort(arr);
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = arr[i];
		}
		return res;
	}

}
