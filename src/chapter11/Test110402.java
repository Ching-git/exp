package chapter11;

import java.util.Vector;

//ʹ��Vectorʵ�ֶ��й���
public class Test110402 {
	
	static String[] months = { "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November",
			"December" };

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>();
		
		for (int i = 0; i < months.length; i++) {
			vector.addElement(months[i]);
		}

		while (vector.isEmpty()) {
			System.out.println("Empty");
		}
		
		while (!vector.isEmpty()) {
			System.out.println(vector.firstElement());
			vector.remove(vector.firstElement());
		}
		
		vector.clear();
	}

}
