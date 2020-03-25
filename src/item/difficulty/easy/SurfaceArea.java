package item.difficulty.easy;

/**
 * 892 题目描述：三维形体的表面积 
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * 请你返回最终形体的表面积
 *
 */
public class SurfaceArea {

	public int surfaceArea(int[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				res += grid[i][j] * 6; // 一个的表面积为6
				if (grid[i][j] > 1)
					res -= (grid[i][j] - 1) * 2; // 当(i,j)上超过1个,要减去z轴重叠部分,两个之间面积为2
				if (i >= 1)
					res -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
				if (j >= 1)
					res -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
				// grid[i][j]会与grid[i - 1][j], grid[i][j - 1]有接触
				// 接触面个数为二者的最小,每一个接触面面积同样也是2,减去
			}
		}
		return res;
	}
}
