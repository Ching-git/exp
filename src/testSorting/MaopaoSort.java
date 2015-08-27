package testSorting;

/**
 * ð������
 * 
 * @author Gao-Yung
 *
 */
public class MaopaoSort {

	public static void main(String[] args) {

		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

		// ͳ����Ҫ���м���ð��
		int count = 0;

		count = sort(a, count);

		System.out.println("�������Ϊ��" + count);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int sort(int[] a, int count) {

		for (int i = 0; i < a.length - 1; i++) {
			// ��������ǰ����������־��Ϊfalse����������˽���������Ϊtrue���������Ϊfalse��˵���Ѿ������ź��򣬲���Ҫ�ڴ˽���ð��
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
