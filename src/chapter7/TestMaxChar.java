package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TestMaxChar {

	public static void main(String[] args) {

		String input = "aavzcadfdsfsdhshgwasdfasdfdddaaa";
		new TestMaxChar().doString(input);
	}

	private void doString(String input) {

		char[] chars = input.toCharArray();
		ArrayList<String> lists = new ArrayList<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println(set);
		Collections.sort(lists);
		System.out.println(lists);
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
		}
		input = sb.toString();
		System.out.println(input);
		int max = 0;
		String maxString = "";
		ArrayList<String> maxlList = new ArrayList<String>();
		
		Iterator<String> its = set.iterator();
		while (its.hasNext()) {
			String os = (String) its.next();
			int begin = input.indexOf(os);
			int end = input.lastIndexOf(os);
			int value = end - begin + 1;
			
			if (value > max) {
				max = value;
				maxString = os;
				maxlList.add(os);
			}else if (value == max) {
				maxlList.add(os);
			}
//			System.out.println(maxlList);
		}
		
		int index = 0;
		for (int i = 0; i < maxlList.size(); i++) {
			if (maxlList.get(i).equals(maxString)) {
				index = i;
				break;
			}
		}
		System.out.println("max data:");
		for (int i = 0; index++ < maxlList.size(); i++) {
			System.out.print(maxlList.get(i) + " ");
		}
		System.out.println();
		System.out.println("max: " + max);
	}

}
