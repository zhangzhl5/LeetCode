package item.difficulty.easy;

/**
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... +
 * A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1]) 就可以将数组三等分。
 *
 * 
 */
public class CanThreePartsEqualSum {
	
	 public boolean canThreePartsEqualSum(int[] A) {
		 int sum =0 ;
		 for(int i: A) {
			 sum +=i;
		 }
		 if(sum%3 != 0) {
			 return false;
		 }
		 sum = sum/3;
		 int curSum = 0, cnt = 0;
		 // 遍历数组累加，每累加到目标值cnt加1，表示又找到1段
		 // 以为数组是连续的分成三段 所以不用考虑有间隔的情况
		 for(int i = 0; i < A.length-1; i++) {
			 curSum +=A[i];
			 if(curSum == sum) {
				 cnt++;
				 // 当找出两组时就可以返回了
				 if(cnt ==2) {
					 return true;
				 }
				 curSum = 0;
			 }
		 }
		return false;

	 }
}
