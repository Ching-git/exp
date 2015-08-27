package testSorting;

public class SelectSort {

	public static void main(String[] args) {

		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		// 排序次数
		int count = 0;

		count = sort(a, count);

		System.out.println("排序次数：" + count);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int sort(int[] a, int count) {
		
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}
		return count;
	}

}
