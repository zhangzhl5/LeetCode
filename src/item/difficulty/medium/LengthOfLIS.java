package item.difficulty.medium;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。你算法的时间复杂度应该为 O(n2) 。
 * 动态规划(dynamic programming)
 */
public class LengthOfLIS {

	  
	/**
	 * 方法一：动态规划 思路与算法
	 * 定义 dp[i]dp[i] 为考虑前 ii 个元素，以第 ii 个数字结尾的最长上升子序列的长度，注意 \textit{nums}[i]nums[i]
	 * 必须被选取。
	 * 我们从小到大计算 dp[]dp[] 数组的值，在计算 dp[i]dp[i] 之前，我们已经计算出 dp[0 \ldots i-1]dp[0…i−1]
	 * 的值，则状态转移方程为：
	 * dp[i] = max(dp[j]) + 1,   0 =< j < i num[j] < num[i] dp[i]=max(dp[j])+1,其中0≤j<i且num[j]<num[i]
	 * 最后，整个数组的最长上升子序列即所有 dp[i]dp[i] 中的最大值。
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS(int[] nums) {
		    if (nums.length == 0) {
	            return 0;
	        }
		    // 引入一个数组 记录参数数组中以每个下标结尾对应的最长上升序列的长度
	        int[] dp = new int[nums.length];
	        // 第一个数的长度肯定为1
	        dp[0] = 1;
	        // 最长序列长度的值
	        int maxans = 1;
	        for (int i = 1; i < dp.length; i++) {
	            int maxval = 0;
	            for (int j = 0; j < i; j++) {
	            	// 判断当nums[i]做结尾时前面最长上升序列的长度最大的值
	                if (nums[i] > nums[j]) {
	                    maxval = Math.max(maxval, dp[j]);
	                }
	            }
	            // 当nums[i]做结尾时他的长度为前面最大的长度加1
	            dp[i] = maxval + 1;
	            // 和所有数组中记录的值相比取最大的值就是结果
	            maxans = Math.max(maxans, dp[i]);
	        }
	        return maxans;
	  }
	  public static void main(String[] args) {
		  LengthOfLIS l = new LengthOfLIS();
		  int[] nums  =  {10,9,2,5,3,7,101,18};
		  int s = l.lengthOfLIS(nums);
		 System.out.println(s); 
	}
}
