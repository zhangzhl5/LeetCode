package com.zhangzhl.title;

/**
 * »ØÎÄÊý
 *
 */
public class IsPalindrome {
	public static void main(String[] args) {
		isPalindrome(543);
	}
	
	public static boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        boolean isPositive = false;
        if (String.valueOf(arr[0]).equals("-")) {
            return false;
        }
        if(arr.length % 2 == 0){
            isPositive = true;
        }
        int len = arr.length/2;
        for (int i = 0; i < len ;) {
            for(int j = arr.length-1; j > i ;j--) {
                if(arr[i] != arr[j]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

}
