package chapter7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestDiGui {

	public static void main(String[] args) {
		String[] array = new String[]{"1","2","3","4"};
		
		listAll(Arrays.asList(array), "");
	}

	private static void listAll(List<String> asList, String prefix) {

		if (prefix != "") {
			System.out.println(prefix);
		}
		
		for (int i = 0; i < asList.size(); i++) {
			List<String> tempList = new LinkedList<String>(asList);
			listAll(tempList, prefix + tempList.remove(i));
		}
	}

}
