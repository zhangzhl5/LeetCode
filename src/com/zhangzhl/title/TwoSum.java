package com.zhangzhl.title;

public class TwoSum {

	// 给定一个整数数组 nums 和一个目标值
	// target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
	// 示例:
	// 给定 nums = [2, 7, 11, 15], target = 9
	// 因为 nums[0] + nums[1] = 2 + 7 = 9
	// 所以返回 [0, 1]
	public static void main(String[] args) {
		// 添加测试数据
		int [] arr = new int[] {2,5,5,11};
		int target = 10;
		int[]	 t= twoSum(arr,target);
		System.out.println(t[0]+ " "+t[1]);
	}

	/**
	 * 算法思路：双层循环 外层是起始位置从第一个数字开始，内层从是最后一位的开始
	 * 先将第一个数和最后一位累加，内层循环一次递减到外层循环的位置，
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
		if (nums == null)
			return null;
		int len = nums.length;
		if (len < 2) {
			return null;
		}
		for (int j = 0; j < len-1; j++) {
			for (int i = len-1; i > j; i--) {
				int sum = nums[j] + nums[i];
				if (sum == target) {
					return new int[] { j, i };
				}
			}
		}
		return new int[] {};
	}
}
