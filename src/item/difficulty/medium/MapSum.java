package item.difficulty.medium;

import java.util.TreeMap;

/**
 * 677. 键值映射
 * @author zhangzhl
 *
 */
public class MapSum {
	
	private class Node {

		public int value;
		
		public TreeMap<Character, Node> next;

		public Node(int value) {
			this.value = value;
			next = new TreeMap<>();
		}

		public Node() {
			this.value = 0;
		}

	}
	private Node root;
	
    /** Initialize your data structure here. */
    public MapSum() {
    	root = new Node();
    }
    
    public void insert(String key, int val) {
    	Node cur =root;
    	for (int i = 0; i < key.length(); i++) {
    		char c = key.charAt(i);
    		if(cur.next.get(c) == null) {
        		cur.next.put(c, new Node());
        	}
    		cur = cur.next.get(c);
    	}
    	cur.value = val;
    }
    
    public int sum(String prefix) {
    	Node cur = root;
    	for (int i = 0; i < prefix.length(); i++) { 
    		char c = prefix.charAt(i);
    		if(cur.next.get(c) == null) {
        		return 0;
        	}
    		cur = cur.next.get(c);
    	}
		return num(cur);
    }
    
    private int num(Node node) {
    	int res = node.value;
    	for(char c : node.next.keySet()) {
    		res+=num(node.next.get(c));
    	}
		return res;
    }

}
