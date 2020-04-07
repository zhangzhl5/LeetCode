package item.difficulty.medium;

/**
 * 面试题 01.07. 旋转矩阵
 * @author zhangzhl
 *
 */
public class Rotate {
	
	public void rotate(int[][] matrix) {
	    int len = matrix.length;
	        //左右翻
	        for(int i=0;i<len;i++){
	            for(int j=0;j<len/2;j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][len-1-j];
	                matrix[i][len-1-j] = temp;
	            }
	        }
	        //对角线翻转
	        for(int i=0;i<len;i++){
	            for(int j=0;j<len-i;j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[len-1-j][len-1-i];
	                matrix[len-1-j][len-1-i] = temp;
	            }
	        }
	    }
}
