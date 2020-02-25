package item.specialtopic.sort;

/**
 * 类描述：冒泡排序算法的原理如下： 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 * 
 * @author zhangzhl
 */
public class BubbleSort {

	public static void BubbleSort1(int[] arr) {

		int temp;// 临时变量
		boolean flag;// 是否交换的标志
		for (int i = 0; i < arr.length - 1; i++) { // 表示趟数，一共 arr.length-1 次

			// 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
			flag = false;

			for (int j = arr.length - 1; j > i; j--) { // 选出该趟排序的最大值往后移动

				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					flag = true; // 只要有发生了交换，flag就置为true
				}
			}
			// 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
			if (!flag)
				break;
		}
	}
}
