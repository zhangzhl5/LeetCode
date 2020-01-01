package item.difficulty.easy;

/**
 * 给定一个正整数数组 nums。
 *
 * 找出该数组内乘积小于 k 的连续的子数组的个数。
 *
 * 示例 1:
 *
 * 输入: nums = [10,5,2,6], k = 100 输出: 8 解释: 8个乘积小于100的子数组分别为: [10], [5], [2],
 * [6], [10,5], [5,2], [2,6], [5,2,6]。 需要注意的是 [10,5,2] 并不是乘积小于100的子数组。 说明:
 *
 * 0 < nums.length <= 50000 0 < nums[i] < 1000 0 <= k < 10^6
 */

public class numSubrrayProductLessThank {

	public static void main(String[] args) {
		numSubrrayProductLessThank s = new numSubrrayProductLessThank();
		int[] arr = { 10, 5, 2, 6 };
		int num = s.numSubarrayProductLessThanK(arr, 100);
		System.out.println(num);
	}

	// 双指针法，如果一个子串的乘积小于k，那么他的每个子集都小于k，而一个长度为n的数组，
	// 他的所有连续子串数量是1+2+...n，但是会和前面的重复。 比如例子中[10, 5, 2, 6]，
	// 第一个满足条件的子串是[10]，第二个满足的是[10, 5]，但是第二个数组的子集[10]和前面的已经重复了，
	// 因此我们只需要计算包含最右边的数字的子串数量，就不会重复了，也就是在计算[10, 5]这个数组的子串是，
	// 只加入[5]和[10, 5]，而不加入[10]，这部分的子串数量刚好是r - l + 1
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;

		int n = nums.length;
		long p = 1l;
		int i = 0, total = 0;
		for (int j = 0; j < n; j++) {
			System.out.println("本数为" + nums[j]);
			p *= nums[j];
			System.out.println("本乘数为" + p);
			while (p >= k) {
				p /= nums[i];
				i++;
			}
			total += (j - i + 1);
			System.out.println("个数为" + total);
		}

		return total;
	}

}
