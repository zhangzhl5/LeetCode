package item.difficulty.easy;

public class LastRemaining {
	
    public int lastRemaining(int n, int m) {
    int flag = 0;   
    for (int i = 2; i <= n; i++) {
        flag = (flag + m) % i;
        //动态规划的思想，将f(n,m)替换成flag存储
    }
    return flag;
    }
    
    public static void main(String[] args) {
    	LastRemaining l = new LastRemaining();
    	l.lastRemaining(5, 3);
	}

}
