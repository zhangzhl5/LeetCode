package item.difficulty.medium;

import java.util.Stack;

/**
 * 394. 字符串解码
 * 
 * @author zhanghzl
 *
 */
public class DecodeString {

	/**
	 * 本题中可能出现括号嵌套的情况，比如 2[a2[bc]]，这种情况下我们可以先转化成 2[abcbc]，在转化成abcbcabcbc。
	 * 我们可以把字母、数字和括号看成是独立的 TOKEN，并用栈来维护这些 TOKEN。具体的做法是，遍历这个栈：
	 * 如果当前的字符为数位，解析出一个数字（连续的多个数位）并进栈 如果当前的字符为字母或者左括号，直接进栈
	 * 如果当前的字符为右括号，开始出栈，一直到左括号出栈，出栈序列反转后拼接成一个字符串，此时取出栈顶的数字（此时栈顶一定是数字，想想为什么？），
	 * 就是这个字符串应该出现的次数，我们根据这个次数和字符串构造出新的字符串并进栈
	 * 重复如上操作，最终将栈中的元素按照从栈底到栈顶的顺序拼接起来，就得到了答案。
	 * 注意：这里可以用不定长数组来模拟栈操作，方便从栈底向栈顶遍历。
	 * @param s
	 * @return
	 */
	public String decodeString(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i) == ']') {
				String string="";
				while(!stack.peek().equals("[")) {
					string=stack.pop()+string;
				}
				stack.pop();
				String countString="";
				while((!stack.isEmpty())&&(stack.peek().charAt(0)>='0'&&stack.peek().charAt(0)<='9')) {
					countString=stack.pop()+countString;
				}
				int count=Integer.parseInt(countString);
				String retString="";
				for(int j=0;j<count;j++) {
					retString=retString+string;
				}
				stack.push(retString);
			} else {
				String str=""+s.charAt(i);
				stack.push(str);
			}
		}
		String result ="";
		while(!stack.isEmpty()) {
			result=stack.pop()+result;
		}
		return result;
	}
	

	public static void main(String[] args) {
		String s ="100[leetcode]";
		DecodeString  decodeString = new DecodeString();
		System.out.println(decodeString.decodeString(s));
	}

}
