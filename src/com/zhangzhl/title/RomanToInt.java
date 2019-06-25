package com.zhangzhl.title;

/**
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 */
public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt("MDIV"));;
		
	}
	//	I             1
	//	V             5
	//	X             10
	//	L             50
	//	C             100
	//	D             500
	//	M             1000
//	I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//	X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//	C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

	 public static int romanToInt(String s) {
		 
		char[] arr = s.toCharArray();
		int len = arr.length;
		int num = 0;
		for(int i = len-1;i >= 0; i -- ) {
			
			 if(arr[i] == 'I'){
				num = num + 1;
				continue;
				
			} else if(arr[i] == 'V'){
				num = num + 5;
				if(i-1 >= 0 && arr[i-1] == 'I' ){
					num = num - 1 ;
					i = i-1 ;
				}
				continue;
				
			} else if(arr[i] == 'X'){
				num = num + 10;
				if(i-1 >= 0 && arr[i-1] == 'I' ){
					num = num - 1 ;
					i = i-1 ;
				}
				continue;
				
			} else if(arr[i] == 'L'){
				num = num + 50;
				if(i-1 >=  0 && arr[i-1] == 'X' ){
					num = num - 10 ;
					i = i-1 ;
				}
				continue;
				
			} else if(arr[i] == 'C'){
				num = num + 100;
				if(i-1 >= 0 && arr[i-1] == 'X' ){
					num = num - 10 ;
					i = i-1 ;
				}
				continue;
				
			} else if(arr[i] == 'D'){
				num = num + 500;
				if(i-1 >= 0 && arr[i-1] == 'C' ){
					num = num - 100;
					i = i-1 ;
				}
				continue;
				
			} else if(arr[i] == 'M'){
				num = num + 1000;
				if(i-1 >= 0 && arr[i-1] == 'C' ){
					num = num - 100;
					i = i-1 ;
				}
				continue;
			}
		}
		
		return num;
	        
	 }

}
