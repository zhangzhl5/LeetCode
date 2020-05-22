package item.topic.exam;

public class MaxPower {

	public int maxPower(String s) {
		if(s == null) {
			return 0;
		}
		int maxLen = 0;
		int tempindex = 0;
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length()-1;i++) {
			if(arr[i] == arr[i+1]) {
				tempindex++;
			} else {
				maxLen = maxLen > tempindex+1? maxLen:tempindex+1;
;				tempindex = 0;
			}
		}
		return maxLen > tempindex ? maxLen:tempindex+1;
	}

	public static void main(String[] args) {
		MaxPower l = new MaxPower();
		System.out.println(l.maxPower("h"));
	}
}
