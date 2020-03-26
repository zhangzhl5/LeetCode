package item.difficulty.easy;

/**999 题目描述：车的可捕获数量
 * @author Administrator
 *
 */
public class NumRookCaptures {
	  public int numRookCaptures(char[][] board) {
		  for(int i = 0;i <board.length;i++ ) {
			  for(int j = 0;j < board[i].length;j++) {
				  if(board[i][j] == 'R') {
					//以R为原点建立坐标系
	                //依次向上找,向下找,向右找,向左找
	                return cap(board,i,j,0,1)+cap(board,i,j,0,-1)+cap(board,i,j,1,0)+cap(board,i,j,-1,0);
				  }
			  }
		  }
		return 0;
	  }
	  
	public int cap(char[][] board, int x, int y, int dx, int dy) {
		/*
		 * 参数说明 a为原数组矩阵 x,y为R的坐标 dx,dy为增长步长
		 */
		while (x >= 0 && x < board.length && y >= 0 && y < board[x].length && board[x][y] != 'B') {
			if (board[x][y] == 'p') {
				return 1;
			}
			x += dx;
			y += dy;
		}
		return 0;
	}

}
