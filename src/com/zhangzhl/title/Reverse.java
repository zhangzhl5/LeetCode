package com.zhangzhl.title;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * @author Administrator
 * 
 */
public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverse(-2143847412));
	}

	public static int reverse(int x) {
		boolean isNegative = false;
		boolean flag = false;
		char[] arr = String.valueOf(x).toCharArray();
		int beginIndex = 0;
		if (String.valueOf(arr[0]).equals("-")) {
			isNegative = true;
			beginIndex = 1;
		}
		if ((isNegative && arr.length > 11) || (!isNegative && arr.length > 10)) {
			return 0;
		}
		if ((arr.length % 2 == 0 && !isNegative)
				|| (arr.length % 2 != 0 && isNegative)) {
			flag = true;
		}
		int len = arr.length / 2;
		// 不能整除也不是正数
		// 能整除也不是正数
		// 不能整除也不是正数
		if (flag && isNegative) {
			len = len + beginIndex;
		}
		for (int i = beginIndex; i < len;) {
			for (int j = arr.length - 1; j > i; j--) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				;
				i++;
			}
		}
		StringBuffer str = new StringBuffer();
		for (int s = 0; s < arr.length; s++) {
			str.append(arr[s]);
		}
		Long l = Long.valueOf(str.toString());
		if (isNegative && l < Integer.MIN_VALUE) {
			return 0;
		} else if (l > Integer.MAX_VALUE) {
			return 0;
		}
		int num = Integer.valueOf(str.toString());

		return num;

	}
}
