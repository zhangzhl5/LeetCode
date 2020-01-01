package item.difficulty.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 有效字符串需满足： 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串
 */
public class IsValid {
	/**
	 * 业务分析： 1、一个元素要么入栈要么消除：入栈的只能是左括号，消除的一定是右括号； 2、能全部完成消除，便有效； 工程实现：
	 * 1、一个元素要么是左括号，要第是右括号；你可以基于左括号的先入为主进行编程，也可以基于右括号的假设为前提
	 * 2、假设这是右括号，那么它必须找到栈里的头元素进行消除，否则便是无效字符串
	 */
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}

	public static boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		char[] arr = s.toCharArray();
		if (arr.length == 0) {
			return true;
		}
		if (arr.length % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char in : s.toCharArray()) {
			// 左括号直接入栈
			if (map.keySet().contains(in)) {
				stack.push(in);
				continue;
			}
			if (!stack.isEmpty() && in == map.get(stack.pop()))
				continue;
			return false;
		}
		return stack.isEmpty();
	}
}
