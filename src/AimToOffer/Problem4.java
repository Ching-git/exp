package aimToOffer;

import java.util.Arrays;

public class Problem4 {

	private static StringBuffer str = new StringBuffer(" helloworld");

	public static void main(String[] args) {

		String string = replaceSpace(str);
		System.out.println(string);
	}

	private static String replaceSpace(StringBuffer str) {

		if (str == null || str.length() == 0) {
			return "";
		}

		int originalLength = str.length();
		int newLength = 0;
		int numberOfBlank = 0;
		for (int i = 0; i < originalLength; i++) {
			if (str.charAt(i) == ' ') {
				numberOfBlank++;
			}
		}
		System.out.println(numberOfBlank);
		newLength = originalLength + numberOfBlank * 2;
		char[] strChar = new char[newLength];
		str.getChars(0, originalLength, strChar, 0);
		System.out.println(Arrays.toString(strChar));

		int indexOfOriginal = originalLength - 1;
		int indexOfNew = newLength - 1;
		while (indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
			if (strChar[indexOfOriginal] == ' ') {
				strChar[indexOfNew--] = '0';
				strChar[indexOfNew--] = '2';
				strChar[indexOfNew--] = '%';
			} else {
				strChar[indexOfNew--] = strChar[indexOfOriginal];
			}
			System.out.println(Arrays.toString(strChar));
			--indexOfOriginal;
		}
		return new String(strChar);
	}

}
