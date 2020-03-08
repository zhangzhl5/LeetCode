package item.difficulty.medium;

import java.util.Arrays;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。
 * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1
 * 
 * @author zhangzhl
 *
 */
public class CoinChange {

	public static void main(String[] args) {
		CoinChange o = new CoinChange();
		int[] coins = { 186, 419, 83, 408 };
		int amount = 6249;
		System.out.println(o.coinChange(coins, amount));
	}
	int ans = Integer.MAX_VALUE;
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		dfs(coins, coins.length - 1, amount, 0);
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

	public void dfs(int[] coins,int index,int amount,int cnt){
	        if(index < 0) {
	            return;
	        }
	        // 从最大的面额开始，保证面额最大的数量最多
	        for(int c = amount/coins[index];c >= 0;c--) {
	            int na=amount-c*coins[index];
	            int ncnt=cnt+c;
	            if(na==0){
	                ans=Math.min(ans,ncnt);
	                break;//剪枝1
	            }
	            if(ncnt+1>=ans){
	                break; //剪枝2
	            }
	            dfs(coins,index-1,na,ncnt);
	        }

	}
}
