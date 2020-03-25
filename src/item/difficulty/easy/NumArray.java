package item.difficulty.easy;

/**
 * 303 题目描述：区域和检索 -数组可变 
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，
 * 包含 i, j 两点。 update(i, val) 函数可以通过将下标为 i 的数值更新为 val，从而对数列进行修改。
 * @author zhangzhl
 */
public class NumArray {
	/**
	 * Your NumArray object will be instantiated and called as such: NumArray obj =
	 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
	 */

	// sum【i️】储存前i个元素的和 sum【i】 = nums【0】+...+ nums【i-1】
	private int[] sum;
	private int[] data;
	public NumArray(int[] nums) {
		data = new int[nums.length];
		for (int i = 0 ; i < nums.length; i++) {
			data[i] = nums[i];
		}
		sum = new int[nums.length + 1];
		sum[0] = 0;
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + nums[i - 1];
		}
	}

	public void update(int i, int val) {
		data[i] = val;
		for(int j = i+1;j<sum.length;j++) {
			sum[j] = sum[j - 1] + data[j - 1];
		}
	}

	public int sumRange(int i, int j) {
		return sum[j + 1] - sum[i];
	}

}
