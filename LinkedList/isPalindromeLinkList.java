package LinkedList;

import java.util.Stack;

public class isPalindromeLinkList {
	public static class Node{
		public int value;
		public Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	public static boolean isPalindrome1(Node head) {
		Stack<Node> stack = new Stack<Node>();
		Node cur = head;
		while (cur != null) {
			stack.push(cur);
			cur = cur.next;
		}
		while (head != null) {
			if (head.value != stack.pop().value) {
				return false;
			}
			head = head.next;
		}
		return true;
	}
	public static void printLinkList(Node node) {
		System.out.println("linklist:");
		while (node != null) {
			System.out.print(node.value+ " ");
			node = node.next;
		}
		System.out.println();
	}
}
