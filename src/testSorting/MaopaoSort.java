package testSorting;

/**
 * 冒泡排序
 * 
 * @author Gao-Yung
 *
 */
public class MaopaoSort {

	public static void main(String[] args) {

		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		// 统计需要进行几次冒泡
		int count = 0;

		count = sort(a, count);

		System.out.println("排序次数为：" + count);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int sort(int[] a, int count) {

		for (int i = 0; i < a.length - 1; i++) {
			// 本趟排序前，将交换标志置为false，如果发生了交换，则置为true，如果最终为false，说明已经数组排好序，不需要在此进行冒泡
			Boolean exchange = false;

			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] <= a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					exchange = true;
				}
			}
			count++;
			if (!exchange) {
				return --count;
			}
		}
		return count;
	}

}
