package item.difficulty.easy;

/**
 * 字符串压缩
 * 利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 */
public class CompressString {

	public String compressString(String S) {

		if (S == null || S.length() <= 1) {
			return S;
		}
		StringBuffer str = new StringBuffer();
		str.append(String.valueOf(S.charAt(0)));
		int size = 1;
		for (int i = 1; i < S.length(); i++) {
			if (String.valueOf(S.charAt(i)).equals(String.valueOf(S.charAt(i - 1)))) {
				size++;
			} else {
				str.append(size);
				size = 1;
				str.append(String.valueOf(S.charAt(i)));
			}
		}
		str.append(size);
		// 注意一种长度相同的情况 也返回原字符串
		return S.length() <= str.toString().length() ? S : str.toString();

	}

	public static void main(String[] args) {
		String str = "bb";
		CompressString s = new CompressString();
		System.out.println(s.compressString(str));
	}
}
