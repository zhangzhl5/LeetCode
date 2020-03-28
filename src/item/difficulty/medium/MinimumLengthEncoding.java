package item.difficulty.medium;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * 820. 单词的压缩编码 
 * 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。 
 * 例如，如果这个列表是 ["time","me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
 * 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
 * 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
 * @author zhangzhl
 */
public class MinimumLengthEncoding {
	
    /**
     * 字典树的解法
     * @param words
     * @return
     */
    public int minimumLengthEncoding(String[] words) {
    	  // 先对单词列表根据单词长度由长到短排序 因为长的包含短的不会累计
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
    	Trie trie = new Trie();
    	int len = 0;
    	for(int i = 0 ;i < words.length;i++ ) {
    		len += trie.add(words[i]);
    	}
		return len;
    }
    
    private class Node {
    	
    	public TreeMap<Character,Node> next ;
		public Node() {
			next = new TreeMap<>();
		}
    }
    
    public class Trie {
    	
    	private Node root;
    	public Trie() {
    		this.root = new Node();
    	}
    	public int add(String word) {
    		Node cur = root;
    		boolean isword = false;
    		for(int i = word.length() -1;i >= 0;i--) {
    			char c = word.charAt(i);
    			if(cur.next.get(c) == null) {
    				isword = true;
    				cur.next.put(c,new Node());
    			}
    			cur = cur.next.get(c);
    		}
			return isword ?  word.length() + 1 : 0;
    	}
    	
    }
    
    public static void main(String[] args) {
    	String[] arr = {"me", "time"};
    	MinimumLengthEncoding a = new MinimumLengthEncoding();
    	int s =a.minimumLengthEncoding(arr);
    	System.out.println(s);
	}
}
