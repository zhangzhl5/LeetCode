package item.topic.exam;


/**
 * 
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。 如果数组中不含幸运数，则返回 -1 。
 * 
 * @author zhangzhl
 *
 */
public class FindLucky {
	int[] nums = new int[500];
	
	public int findLucky(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			nums[arr[i]]+= 1;
		}
		int max = -1;
		for(int j = nums.length-1;j >=0;j--) {
			if(nums[j] == j) {
				max = Math.max(j, max);
			}
		}
		return max == 0 ? -1 : max;

	}
	public static void main(String[] args) {
		int[] arr = {5};
		FindLucky f = new FindLucky();
		int s = f.findLucky(arr);
		System.out.println(s);
	}

}
