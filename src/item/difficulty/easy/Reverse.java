package item.difficulty.easy;

/**
 * ����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 * 
 * @author Administrator
 * 
 */
public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverse(-2143847412));
	}

	public static int reverse(int x) {
		boolean isNegative = false;
		boolean flag = false;
		char[] arr = String.valueOf(x).toCharArray();
		int beginIndex = 0;
		if (String.valueOf(arr[0]).equals("-")) {
			isNegative = true;
			beginIndex = 1;
		}
		if ((isNegative && arr.length > 11) || (!isNegative && arr.length > 10)) {
			return 0;
		}
		if ((arr.length % 2 == 0 && !isNegative)
				|| (arr.length % 2 != 0 && isNegative)) {
			flag = true;
		}
		int len = arr.length / 2;
		// ��������Ҳ��������
		// ������Ҳ��������
		// ��������Ҳ��������
		if (flag && isNegative) {
			len = len + beginIndex;
		}
		for (int i = beginIndex; i < len;) {
			for (int j = arr.length - 1; j > i; j--) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				;
				i++;
			}
		}
		StringBuffer str = new StringBuffer();
		for (int s = 0; s < arr.length; s++) {
			str.append(arr[s]);
		}
		Long l = Long.valueOf(str.toString());
		if (isNegative && l < Integer.MIN_VALUE) {
			return 0;
		} else if (l > Integer.MAX_VALUE) {
			return 0;
		}
		int num = Integer.valueOf(str.toString());

		return num;

	}
}
