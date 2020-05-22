package item.difficulty.medium;

/**
 * 给定一个字符串，找出其中不含有重复字符的最长子串的长度。
 * @author zhangzhl
 *
 */
public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int len = s.length();
		char[] arr = s.toCharArray();

		if (len == 1) {
			return 1;
		}
		int max = 0;

		for (int i = 0; i < len; i++) {
			StringBuffer str = new StringBuffer();
			str.append(arr[i]);
			for (int j = i + 1; j < len; j++) {
				if (str.toString().contains(String.valueOf(arr[j]))) {
					if (max < str.length()) {
						max = str.length();
					}
					break;
				}
				str.append(arr[j]);
			}
			if (str.length() > max) {
				max = str.length();
			}
		}
		if (max == 0) {
			max = len;
		}
		return max;

	}

	public static void main(String[] args) {
		LengthOfLongestSubstring l = new LengthOfLongestSubstring();
		System.out.println(l.lengthOfLongestSubstring("leetcode"));
	}
}