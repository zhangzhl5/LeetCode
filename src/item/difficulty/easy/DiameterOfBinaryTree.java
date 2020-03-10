package item.difficulty.easy;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 * 
 * @author zhangzhl
 *
 */
public class DiameterOfBinaryTree {

//	Definition for a binary tree node.
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	int ans;

	public int diameterOfBinaryTree(TreeNode root) {
		ans = 1;
		depth(root);
		return ans - 1;

	}

	public int depth(TreeNode node) {
		if (node == null)
			return 0; // 访问到空节点了，返回0
		int L = depth(node.left); // 左儿子为根的子树的深度
		int R = depth(node.right); // 右儿子为根的子树的深度
		ans = Math.max(ans, L + R + 1); // 计算d_node即L+R+1 并更新ans
		return Math.max(L, R) + 1; // 返回该节点为根的子树的深度
	}
}
