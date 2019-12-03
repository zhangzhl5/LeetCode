package com.zhangzhl.title;

/**
 * ����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ� ����: "abcabcbb" ���: 3 ����: ��Ϊ���ظ��ַ�����Ӵ���
 * "abc"�������䳤��Ϊ 3��
 */
public class LengthOfLongestSubstring {

	/**
	 * �˷�����ʱ̫�ã�
	 * ִ����ʱ : 194 ms , ������ java �ύ�л����� 7.28% ���û� 
	 * �ڴ����� : 38 MB , ������ java �ύ�л����� 90.13% ���û�
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
			// �������û�п��ǵ����һ�α���ʱ����Խ�������
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