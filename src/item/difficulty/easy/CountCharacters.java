package item.difficulty.easy;

/**
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。 假如你可以用 chars 中的『字母』（字符）拼写出
 * words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 */
public class CountCharacters {

	public int countCharacters(String[] words, String chars) {
		if (words.length < 1 || chars == null) {
			return 0;
		}
		int len = 0;
		int[] chars_count = count(chars); // 统计字母表的字母出现次数
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > chars.length()) {
				continue;
			}
			int[] word_count = count(words[i]); // 统计单词的字母出现次数
			if (contains(chars_count, word_count)) {
				len += words[i].length();
			 }
		}
		return len;
	}

	// 检查字母表的字母出现次数是否覆盖单词的字母出现次数
	boolean contains(int[] chars_count, int[] word_count) {
	    for (int i = 0; i < 26; i++) {
	        if (chars_count[i] < word_count[i]) {
	            return false;
	        }
	    }
	    return true;
	}
	
	// 统计 26 个字母出现的次数
	int[] count(String word) {
		int[] counter = new int[26];
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			// 利用ASCII码表的差值作为数组的下标。
			counter[c - 'a']++;
		}
		return counter;
	}
	public static void main(String[] args) {
		int s = 'd' - 'a';
		System.out.println(s);
	}
}
