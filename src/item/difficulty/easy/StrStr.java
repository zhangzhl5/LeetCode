package item.difficulty.easy;

/**
 * 28.实现 strStr()函数。 
 * 给定一个haystack 字符串和一个 needle字符串，在 haystack字符串中找出 needle
 * 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * @author Administrator
 */
public class StrStr {
	public int strStr(String haystack, String needle) {
		if(haystack == null && needle== null) {
			return 0;
		}
		if(haystack == null || needle== null || needle.length() > haystack.length()) {
			return -1;
		}
		if(needle.length() == 0) {
			return 0;
		}
		boolean hasword = false;
		int begin  = -1;
		for(int i = 0; i <= haystack.length() - needle.length();i++) {
			begin = i;
			int index = begin;
			for(int j = 0; j < needle.length(); j++) {
				if(haystack.charAt(index) != needle.charAt(j)) {
				  break;
				}
				index++;
				if(j == (needle.length() - 1) ) {
					 hasword = true;
				}
			}
			if(hasword) {
				return begin;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		String s = "mississippi",	b ="issip";
		StrStr str = new StrStr();
		int n = str.strStr(s, b);
		System.out.println(n);
	}
}
