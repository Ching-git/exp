package testSorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void sort(int[] a) {

		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
	}

	private static void quickSort(int[] a, int low, int high) {

		if (low < high) {
			int middle = getMiddle(a, low, high);
			quickSort(a, low, middle - 1);
			quickSort(a, middle + 1, high);
		}
	}

	private static int getMiddle(int[] a, int low, int high) {
		int temp = a[low];
		while (low < high) {
			while (low < high && a[high] >= temp) {
				high--;
			}
			a[low] = a[high];
			a[high] = temp;
			while (low < high && a[low] <= temp) {
				low++;
			}
			a[high] = a[low];
			a[low] = temp;
		}
		return low;
	}

}
