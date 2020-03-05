package item.difficulty.easy;

/**
 * 排排坐，分糖果。
 * 
 * @author zhangzhl
 *
 */
public class DistributeCandies {

	public int[] distributeCandies(int candies, int num_people) {
		int[] nums = new int[num_people];
		// 当前给出的糖
		int curr_give = 1;
		// 当糖的数量大于零时继续分配
		while (candies > 0) {
			for (int i = 0; i < nums.length && candies > 0; i++) {
				if (candies > curr_give) {
					nums[i] += curr_give;
				} else {
					nums[i] += candies;
				}
				candies = candies - curr_give;
				curr_give++;
			}
		}
		return nums;
	}

}
