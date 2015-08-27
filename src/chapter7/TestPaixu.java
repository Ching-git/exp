package chapter7;

public class TestPaixu {

	private static int count = 0;
	
	public static void main(String[] args) {

		String s = "1223";
		Pailie(s,"");
		System.out.println(count);
	}

	private static void Pailie(String s, String string) {

		if (s.length() < 1) {
			System.out.println(string);
			count++;
		} else {
			int index[] = new int[s.length()];
			for (int i = 0; i < index.length; i++) {
				index[i] = s.indexOf(s.charAt(i));
			}
			
			for (int i = 0; i < s.length(); i++) {
				if (i == index[i]) {
					Pailie(s.substring(1), string + s.substring(0, 1));
				}
				s = s.substring(1) + s.substring(0, 1);
			}
		}
		
	}

}
