package item.difficulty.medium;

/**
 * 1111. 有效括号的嵌套深度
 * 
 * @author zhangzhl
 *
 */
public class MaxDepthAfterSplit {
	
	public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int [seq.length()];
        int idx = 0;
        for(char c: seq.toCharArray()) {
        	 ans[idx++] = c == '(' ? ((idx+1) & 1) : idx & 1;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		String seq = "()(())()";
		MaxDepthAfterSplit m = new MaxDepthAfterSplit();
		System.out.println(m.maxDepthAfterSplit(seq));
	}
}
