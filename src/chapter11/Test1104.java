package chapter11;

import java.util.Stack;


//使用Stack实现栈的方式输出
public class Test1104 {

	static String[] months = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		for (int i = 0; i < months.length; i++) {
			stack.push(months[i]);
		}
		
		System.out.println("stack ：" + stack);
		
		stack.add("The last line");
		System.out.println("element 5 = " + stack.elementAt(5));
		System.out.println("Poping elements");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
}
