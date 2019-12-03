package com.zhangzhl.title;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 输入: "abcabcbb" 输出: 3 解释: 因为无重复字符的最长子串是
 * "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {

	/**
	 * 此方法耗时太久：
	 * 执行用时 : 194 ms , 在所有 java 提交中击败了 7.28% 的用户 
	 * 内存消耗 : 38 MB , 在所有 java 提交中击败了 90.13% 的用户
	 * @param s
	 * @return
	 */
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
			// 这个点是没有考虑到最后一次遍历时数组越界的问题
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
		System.out.println(l.lengthOfLongestSubstring("aab"));
	}
}