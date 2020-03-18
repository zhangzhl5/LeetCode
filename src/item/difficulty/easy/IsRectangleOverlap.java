package item.difficulty.easy;

/**
 * 题目：矩形重叠
 * 
 * 矩形以列表 [x1, y1, x2, y2] 的形式表示，其中 (x1, y1) 为左下角的坐标，(x2, y2) 是右上角的坐标。
 * 如果相交的面积为正，则称两矩形重叠。需要明确的是，只在角或边接触的两个矩形不构成重叠。
 * 给出两个矩形，判断它们是否重叠并返回结果。
 *
 */
public class IsRectangleOverlap {
	
	  /**
	   * 思考：如果矩形不重叠 那就只要满足不重叠的条件就可以了 结果最后取反就是重叠的答案
	   * 考虑X轴和Y轴的两种情况
	 * @param rec1
	 * @param rec2
	 * @return
	 */
	public  static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		
		if(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec2[2] <= rec1[0] || rec2[3] <= rec1[1]) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] rec1 = {0,0,1,1};
		int[] rec2	= {1,0,2,1};
		boolean flag = IsRectangleOverlap.isRectangleOverlap(rec1, rec2);
		System.out.println(flag);
	}

} 
