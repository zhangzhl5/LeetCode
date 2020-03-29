package item.topic.exam;

/**
 * 统计作战单位数
 * n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。
 * 每 3 个士兵可以组成一个作战单位，分组规则如下：
 * 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k] 作战单位需满足：
 * rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[k] ，
 * 其中 0 <= i < j < k < n 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。
 * 
 * @author zhangzhl
 *
 */
public class NumTeams {

	/**
	 * 第一步：利用动态规划的思想
	 * 遍历该数组的没一个士兵，判断他的所有可能情况
	 * 分两种遍历一种是升序一种是降序
	 * @param rating
	 * @return
	 */
	public int numTeams(int[] rating) {
		int sum = 0;
		if(rating == null ||rating.length < 3) {
			return 0;
		}
		// 遍历到倒数第三位即可
		for(int i = 0;i < rating.length - 2;i++) {
			int up = dp(i,rating,rating[i]);
			int down =down(i,rating,rating[i]);
			sum = sum+up+down;
		}
		return sum;

	}

	/**
	 * 方法描述：动态规划降序计算可能情况
	 * @param i
	 * @param rating
	 * @param j
	 * @return
	 */
	private int down(int i, int[] rating, int j) {
		int len = 0;
		int mid = i + 1;
		for(int s = mid; s < rating.length - 1;s++) {
			for(int n = s + 1; n < rating.length;n++) {
				if(rating[s] < j && rating[n] < rating[s]) {
					len += 1;
				}
			}
			
		}
		return len;
	}

	/**
	 * 方法描述：动态规划升序计算可能情况
	 * @param i
	 * @param rating
	 * @param j
	 * @return
	 */
	private int dp(int i, int[] rating, int j) {
		int len = 0;
		int mid = i + 1;
		for(int s = mid; s < rating.length - 1;s++) {
			for(int n = s + 1; n < rating.length;n++) {
				if(rating[s] > j && rating[n] > rating[s]) {
					len += 1;
				}
			}
		}
		return len;
	}
	public static void main(String[] args) {
		int[] rating = {1,2,3,4};
		NumTeams numTeams = new NumTeams();
     	int	 s = numTeams.numTeams(rating);
     	System.out.println(s);
	}
}
