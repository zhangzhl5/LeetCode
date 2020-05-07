package item.difficulty.easy;

/**
 * 572. 另一个树的子树 
   *  给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
 * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 */
public class IsSubtree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSameTree(TreeNode s, TreeNode t) {
		// 同时为空 说明树一起到底，两树相同
		if (s == null && t == null) {
			return true;
		}
		// 如果上面没有返回值，说明必有一个没有为空（有可能两个都不为空）
		if (s == null || t == null) {
			return false;
		}
		// 如果判断到了这一步，说明两个都不为空
		// 先序遍历 自己 -- 左 -- 右
		if (s.val != t.val) {
			return false;
		}
		return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		// 我s都遍历完了。你居然还没匹配上。那就返回false
		if (s == null) {
			return false;
		}
		// 短路运算符，有一个为真，返回真
		return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
	}
}
