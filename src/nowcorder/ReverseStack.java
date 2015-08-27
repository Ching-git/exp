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
		System.out.println("��תǰ��");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack);
		System.out.println("��ת��");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

	private static void reverse(Stack<Integer> stack) {
		// ��һ��ݹ���ú���
		if (stack.isEmpty()) {
			return;
		}
		int temp = getAndRemoveLast(stack);		//��ȡջ�����Ƚ�������֣�Ȼ�����ջ��ɾ��
		reverse(stack);
		stack.push(temp); 	//��ÿһ��ȡ����ջ�еõ���ײ�����ȡ��������ѹ��ջ��
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
