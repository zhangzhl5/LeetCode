package item.difficulty.medium;

/**
 * 面试题56 - I. 数组中数字出现的次数
 */
public class SingleNumbers {

	/**
	 * 
	 * 相同的数异或为0，不同的异或为1。0和任何数异或等于这个数本身。
	 * 所以，数组里面所有数异或 = 目标两个数异或 。 由于这两个数不同，所以异或结果必然不为0。
	 * 假设数组异或的二进制结果为10010，那么说明这两个数从右向左数第2位是不同的
	 * 那么可以根据数组里面所有数的第二位为0或者1将数组划分为2个。
	 * 这样做可以将目标数必然分散在不同的数组中，而且相同的数必然落在同一个数组中。
	 * @param nums
	 * @return
	 */
	public int[] singleNumbers(int[] nums) {

		// 用于将所有的数异或起来
		int k = 0;
		for (int num : nums) {
			k ^= num;
		}
		// 获得k中最低位的1
		// 假设数组异或的二进制结果为10010，那么说明这两个数从右向左数第2位是不同的
		int mask = 1;
		// mask = k & (-k) 这种方法也可以得到mask
		// a&(-a)=最低位为1的二进制（从又到左）
		while ((k & mask) == 0) {
			mask <<= 1;
		}
		int a = 0;
		int b = 0;
		for (int num : nums) {
			if ((num & mask) == 0) {
				a ^= num;
			} else {
				b ^= num;
			}
		}
		return new int[] { a, b };
	}

}
