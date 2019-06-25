package com.zhangzhl.title;

//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""
public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] str = new String[]{"flower","fl","flight"};
		System.out.println(""+longestCommonPrefix(str)+"");
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		int num = strs.length;
		if(strs.length == 0 ||strs.length == 1) {
			return null;
		}
		
		int minlen = strs[0].length();
		if(minlen == 0){
			return null;
		}
		int minstr = 0;
		for(int i = 1; i < num;i++) {
			if(strs[i].length() == 0){
				return null;
			}
			if(strs[i].length() < minlen) {
				minlen = strs[i].length();
				minstr = i;
			}
		}
		StringBuffer str = new StringBuffer();
		char[] stort = strs[minstr].toCharArray();
		int w= 0;
		for(int j = 0;j < minlen; j++){
			for(int i = 0; i < num;i++) {
				if(strs[i].toCharArray()[j] != stort[j]){
					w = j;
					break;
				}
				
			}
			if(w != stort.length ){
				break;
			}
		}
		for(int s = 0 ; s <= w; s ++) {
			str.append(stort[s]);
		}
		return str.toString();
   }
}
