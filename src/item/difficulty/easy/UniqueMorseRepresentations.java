package item.difficulty.easy;

import java.util.HashSet;

/**
 * 题目描述：唯一摩斯密码词
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
返回我们可以获得所有词不同单词翻译的数量。
 * @author zhangzhl
 *
 */
public class UniqueMorseRepresentations {
	
	String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
						".---","-.-",".-..","--","-.","---",".--.","--.-"
						,".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	public int uniqueMorseRepresentations(String[] words) {
		if (words == null) return 0;
        HashSet<String> set = new HashSet<String>();
        for (String s : words) {
            StringBuilder str = new StringBuilder();
            for (char c : s.toCharArray()) {
                str.append(codes[c - 'a']);
            }
            set.add(str.toString());
        }
        return set.size();
	}

}
