package item.difficulty.medium;

/**
 * 面试题56 - I. 数组中数字出现的次数
 * 
 * @author Administrator
 *
 */
public class SingleNumbers {

	/**
	 * 
	 * 异或的性质:两个数字异或的结果a^b是将 a 和 b 的二进制每一位进行运算，得出的数字。
	 * 运算的逻辑是 如果同一位的数字相同则为 0，不同则为 1
	 * 异或的规律
	 * 任何数和本身异或则为0
	 * 任何数和 0 异或是本身
	 * 异或满足交换律。 即 a ^ b ^ c ，等价于 a ^ c ^ b
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
		int mask = 1;

		// mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
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
