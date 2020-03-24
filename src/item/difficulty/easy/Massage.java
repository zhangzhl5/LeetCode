package item.difficulty.easy;

/**
 *题目描述：按摩师
 * 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。
 * 在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。
 * 给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
 *
 */
public class Massage {
	
	  /**
	   * 方法描述：动态规划
	   * @param nums
	   * @return
	 */
	public int massage(int[] nums) {
		  if(nums == null || nums.length == 0)
		   		return 0;
		   	else if(nums.length == 1){
		   		return nums[0];
		   	}
		   	// res表示前i个预约的最优解，即最优的预约时长
		   	int[] res = new int[nums.length];
		   	res[0] = nums[0];
		   	res[1] = Math.max(nums[0],nums[1]);
		   	for (int i = 2; i < nums.length; i++) {
		   		// 要么前一个接了，这个该休息了；要么是不接前一个，这个该接活了。选两个方案最大的值。
		   		res[i] = Math.max(res[i-1], res[i-2]+nums[i]);
		   	}
		   	return res[nums.length-1];
	   }

}
