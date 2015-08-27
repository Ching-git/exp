package chapter7;

public class Test724 {

	public static void main(String[] args) {

		int[] a = new int[101];
		
		for (int temp = 0; temp < a.length; temp++) {
			a[temp] = 1;
		}
		
		for (int i = 2; i < 101; i++) {
			if (a[i] != 0) {
				for (int j = i + i; j < 101; ) {
					if (j%i == 0) {
						a[j] = 0;
						j+=i;
					}
				}
			}
		}
		for (int i = 2; i < 101; i++) {
			if (a[i] != 0) {
				System.out.println(i);
			}
		}
	}

}
