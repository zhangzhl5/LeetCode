package item.difficulty.easy;

//��дһ�������������ַ��������е������ǰ׺��
//��������ڹ���ǰ׺�����ؿ��ַ��� ""
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = new String[] { "a" };
		System.out.println(longestCommonPrefix(str));

	}

	/**
	 * ˼·���ҵ���̵��ַ�������,Ȼ�����
	 * 
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		int num = strs.length;
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		int minlen = strs[0].length();
		if (minlen == 0) {
			return "";
		}
		int minindex = 0;
		for (int i = 0; i < num; i++) {
			if (strs[i].length() == 0) {
				return "";
			}
			if (strs[i].length() < minlen) {
				minlen = strs[i].length();
				minindex = i;
			}
		}
		StringBuffer str = new StringBuffer();
		char[] stort = strs[minindex].toCharArray();
		int endindex = minlen;
		for (int j = 0; j < minlen; j++) {
			for (int i = 0; i < num; i++) {
				if (strs[i].toCharArray()[j] != stort[j]) {
					endindex = j;
					break;
				}

			}
			if (endindex != minlen) {
				break;
			}
		}
		for (int s = 0; s < endindex; s++) {
			str.append(stort[s]);
		}
		if (str == null) {
			return "";
		}
		return str.toString();
	}
}
