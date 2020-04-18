package item.topic.exam;

public class MinCount {
	
	public int minCount(int[] coins) {
        int times = 0;
        for(int i = 0;i < coins.length;i++) {
        	if(coins[i]%2 == 0) {
        		times +=coins[i]/2;
        	} else {
        		times +=coins[i]/2 + 1;
        	}
        }
		return times;
    }
	
	public static void main(String[] args) {
		int[] s = {0};
		MinCount m = new MinCount();
		int n = m.minCount(s);
		System.out.println(n);
	}

}
