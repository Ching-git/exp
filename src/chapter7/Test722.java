package chapter7;

public class Test722 {

	public static void main(String[] args) {

		int n = 2;
		int res = 1;
		
		while ((getOnly(n) + res) != n) {
			res += getOnly(n);
			++n;
		}
		System.out.println(n);
	}

	private static int getOnly(int n) {

		int number = 0;
		String numString = n + "";
		int len = numString.length();

		if (len != 0) {
			for (int i = 0; i < len; i++) {
				char a = numString.charAt(i);
				if (a == '1') {
					number++;
				}
			}
		}
		
		return number;
	}

}
