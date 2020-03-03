package item.difficulty.easy;

/**
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 */
public class MergeTwoSortArrays {

	
	public void merge(int[] A, int m, int[] B, int n) {

		for (int i = 0; i < n; i++) {
			A[m + i] = B[i];
		}
		int temp;// 临时变量
		boolean flag;// 是否交换的标志
		for (int i = 0; i < A.length - 1; i++) { // 表示趟数，一共 arr.length-1 次
			// 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
			flag = false;
			for (int j = A.length - 1; j > i; j--) { // 选出该趟排序的最大值往后移动

				if (A[j] < A[j - 1]) {
					temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
					flag = true; // 只要有发生了交换，flag就置为true
				}
			}
			// 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
			if (!flag)
				break;
		}
	}
}
