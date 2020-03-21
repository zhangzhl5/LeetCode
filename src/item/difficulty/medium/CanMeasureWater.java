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
        // 辗转相除法  是不是特别眼熟 3.12的每日一题 -> 1071. 字符串的最大公因子
        int tmp = gcd(x, y);
        return z % tmp == 0;
    }

	private int gcd(int x, int y) {
		
		if (y == 0) return x;
		return gcd(y,x % y);
	}
}
