package item.difficulty.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数 
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果可以变为1，那么这个数就是快乐数。 如果 n是快乐数就返回 True ；不是，则返回 False 。
 * 
 * @author Administrator
 *
 */
public class IsHappy {
	
	private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
	
	public boolean isHappy(int n) {
	     Set<Integer> seen = new HashSet<>();
	        while (n != 1 && !seen.contains(n)) {
	            seen.add(n);
	            n = getNext(n);
	        }
	        return n == 1;
	}
	
	public static void main(String[] args) {
		IsHappy isHappy = new IsHappy();
		isHappy.isHappy(1345);
	}
}
