package testSorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		sort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void sort(int[] a, int left, int right) {

		if (left < right) {
			int center = (left + right) / 2;
			sort(a, left, center);
			sort(a, center + 1, right);
			merge(a, left, center, right);
		}
	}

	private static void merge(int[] a, int left, int center, int right) {

		int[] tmpArr = new int[a.length];
		int mid = center + 1;
		int third = left;
		int temp = left;
		while (left <= center && mid <= right) {
			if (a[left] <= a[mid]) {
				tmpArr[third++] = a[left++];
			} else {
				tmpArr[third++] = a[mid++];
			}
		}
		while (left <= center ) {
			tmpArr[third++] = a[left++];
		}
		while (mid <= right ) {
			tmpArr[third++] = a[mid++];
		}
		
		while (temp <= right) {
			a[temp] = tmpArr[temp];
			temp++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
