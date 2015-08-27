package testSorting;

public class ShellSort {

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
		
		double d1 = a.length;
		int temp = 0;
		while (true) {
			d1 = Math.ceil(d1/2);
			int d = (int) d1;
			for (int i = 0; i < d; i++) {
				for (int j = i + d; j < a.length; j += d) {
					temp = a[j];
					for (int k = j - d; k >= 0 && temp < a[k]; k -= d) {
						a[k + d] = a[k];
						a[k] = temp;
						count++;
					}
				}
			}
			if (d==1) {
				break;
			}
		}
		return count;
	}

}
