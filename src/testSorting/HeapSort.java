package testSorting;

public class HeapSort {

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

		System.out.println("开始排序-----");
		int arrayLenght = a.length;
		int temp = 0;
		for (int j = 0; j < arrayLenght; j++) {
			count = buildMaxHeap(a, arrayLenght - j - 1, count);
			temp = a[arrayLenght - j - 1];
			a[arrayLenght - j - 1] = a[0];
			a[0] = temp;
			
		}
		return count;
	}

	private static int buildMaxHeap(int[] a, int lastIndex,int count) {

		int temp = 0;
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			int k = i;
			while (2*k + 1 <= lastIndex) {
				int biggerindex = 2*k + 1;
				if (biggerindex < lastIndex) {
					if (a[biggerindex] < a[biggerindex + 1]) {
						biggerindex++;
					}
				}
				if (a[k] < a[biggerindex]) {
					temp = a[k];
					a[k] = a[biggerindex];
					a[biggerindex] = temp;
					k=biggerindex;
					count++;
				}else {
					break;
				}
			}
		}
		return count;
	}

}
