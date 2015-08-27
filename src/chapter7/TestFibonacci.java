package chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestFibonacci {

	private static int k = 0;
	private static String s = "";
	
	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = bReader.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		int a = Integer.parseInt(s);
		System.out.println(fibonacci(a));
		System.out.println("一共递归了" + k + "次");
	}

	private static int fibonacci(int a) {
		if (a == 0 || a == 1) {
			k++;
			return a;
		}
		return fibonacci(a-1) + fibonacci(a-2);
	}
}
