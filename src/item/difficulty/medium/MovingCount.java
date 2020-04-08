package item.difficulty.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题13. 机器人的运动范围 
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0]的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * 
 * @author Administrator
 *
 */
public class MovingCount {

	public int movingCount(int m, int n, int k) {
		boolean[][] visited = new boolean[m][n];
		return dfs(0, 0, m, n, k, visited);
	}

	private int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {
		if (i < 0 || i >= m || j < 0 || j >= n || (i / 10 + i % 10 + j / 10 + j % 10) > k || visited[i][j]) {
			return 0;
		}
		visited[i][j] = true;
		return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited)
				+ dfs(i, j - 1, m, n, k, visited) + 1;
	}
}
