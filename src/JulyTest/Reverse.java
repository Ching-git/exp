package JulyTest;

public class Reverse {

	private static String inString = "ilovebaofeng";
	
	public static void main(String[] args) {
		
		reverseString(inString, 0, 5);
	}

	private static void reverseString(String inString, int startIndex, int endIndex) {

		System.out.println("数组翻转前：" + inString);
		String reverseString = inString.substring(startIndex, endIndex);
		reverseString = reverseChar(reverseString);
		System.out.println(reverseString);
		String leftString = inString.substring(endIndex, inString.length());
		leftString = reverseChar(leftString);
		System.out.println(leftString);
		inString = reverseString + leftString;
		reverseString = reverseChar(inString);
		System.out.println("数组翻转后：" + reverseString);
	}

	private static String reverseChar(String reverseString) {

		int from = 0;
		int to = reverseString.length() - 1;
		char[] stringChar = new char[reverseString.length()]; 
		reverseString.getChars(0, reverseString.length(), stringChar, 0);
		while (from < to) {
			char temp = stringChar[from];
			stringChar[from] = stringChar[to];
			stringChar[to] = temp;
			from++;
			to--;
		}
		return new String(stringChar);
	}

}
