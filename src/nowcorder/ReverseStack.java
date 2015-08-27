package nowcorder;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("翻转前：");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		System.out.println("翻转后：");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void reverse(Stack<Integer> stack) {
		// 第一层递归调用函数
		if (stack.isEmpty()) {
			return;
		}
		int temp = getAndRemoveLast(stack);		//获取栈中最先进入的数字，然后将其从栈中删除
		reverse(stack);
		stack.push(temp); 	//将每一层取出的栈中得到最底层数据取出，重新压入栈中
	}

	private static int getAndRemoveLast(Stack<Integer> stack) {

		int result = stack.pop();

		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLast(stack);
			stack.push(result);
			return last;
		}
	}

}
