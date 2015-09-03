package aimToOffer;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class Problem5 {

	public static void main(String[] args) {

		ListNode listNode1 = null;
//		= new ListNode(1);
//		ListNode listNode2 = new ListNode(2);
//		ListNode listNode3 = new ListNode(3);
//		ListNode listNode4 = new ListNode(4);
//		listNode1.next = listNode2;
//		listNode2.next = listNode3;
//		listNode3.next = listNode4;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = printListFromTailToHead(listNode1);
		System.out.println(list.toString());

	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}
