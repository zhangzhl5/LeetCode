package item.difficulty.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述：最长回文串 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。 在构造过程中，请注意区分大小写。比如 "Aa"
 * 不能当做一个回文字符串。
 *
 */
public class LongestPalindrome {

	/**
	 * .位与运算符（&）
	   *   运算规则：两个数都转为二进制，然后从高位开始比较，如果两个数都为1则为1，否则为0。
	     *   比如：129&128.
	 * 129转换成二进制就是10000001，128转换成二进制就是10000000。从高位开始比较得到，得到10000000，即128.
	 * 
	 * @param s
	 * @return
	 */
	public int longestPalindrome(String s) {
		if (s == null || s.length() < 0) {
			return 0;
		}
		char[] arr = s.toCharArray();
		Map<Character, Integer> charMap = convertMap(arr);
		int len = 0;
		for (Integer value : charMap.values()) {
			// value & 1 
			// 这步运算得到的值如果是奇数则减去1
			len += value - (value & 1);
		}

		return len < s.length() ? len + 1 : len;

	}

	private Map<Character, Integer> convertMap(char[] arr) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (charMap.containsKey(arr[i])) {
				charMap.put(arr[i], charMap.get(arr[i]) + 1);
			} else {
				charMap.put(arr[i], 1);
			}
		}
		return charMap;
	}
}