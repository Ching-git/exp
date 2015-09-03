package nowcorder;

import java.util.Date;

public class SuperTest extends Date {
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "taobao";

	private void test() {
		System.out.println(super.getClass());
	}

	public static void main(String[] args) {
		double d1 = -0.5;
		System.out.println("Ceil d1=" + Math.ceil(d1));
		System.out.println("floor d1=" + Math.floor(d1));
		new SuperTest().test();

		String a = "tao" + "bao";
		String b = "tao";
		String c = "bao";
		System.out.println(a == MESSAGE);
		System.out.println((b + c) == MESSAGE);
	}
}
