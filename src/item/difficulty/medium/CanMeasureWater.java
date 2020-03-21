package item.difficulty.medium;

/**
 * 365 题目描述：水壶问题
 * @author zhangzhl
 *
 */
public class CanMeasureWater {
	
    public boolean canMeasureWater(int x, int y, int z) {
        // 在一个瓶子为空的情况，另一个瓶子只能等于水的容量，不然没法搞
        if (x == 0 || y == 0) {
            if (x == z || y == z) return true;
            return false;
        }
        // 特判：x+y<z时一定是false！！！ 仔细品一品
        if (x + y < z) return false;
        // 辗转相除法求最大公约数
        int tmp = gcd(x, y);
        return z % tmp == 0;
    }

	/**
	 * 方法描述 ；辗转相除法 Greatest Common Divisor（最大公约数）
	 * 用较大数除以较小数，再用出现的余数（第一余数）去除除数，再用出现的余数（第二余数）去除第一余数，如此反复，直到最后余数是0为止。
	 * 如果是求两个数的最大公约数，那么最后的除数就是这两个数的最大公约数。 
	 * Greatest Common Divisor(
	 * @param x
	 * @param y
	 * @return
	 */
	private int gcd(int x, int y) {
		
		if (y == 0) return x;
		
		return gcd(y,x % y);
	}
}
