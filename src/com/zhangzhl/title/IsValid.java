package com.zhangzhl.title;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足： 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串
 */
public class IsValid {

	public static boolean isValid(String s) {
		char[] arr = s.toCharArray();
		if(arr.length == 0) {
			return true;
		}
		if(arr.length % 2 != 0) {
			return false;
		}
		
		return false;
	}
}
