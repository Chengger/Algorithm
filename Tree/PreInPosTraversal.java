package Tree;

import java.util.Stack;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class PreInPosTraversal {
	public static class Node {
		public int value;
		public Node left;
		public Node right;
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static void preOrderRecur(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.value + " ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	public static void inOrderRecur(Node head) {
		if (head == null) {
			return;
		}
		
		preOrderRecur(head.left);
		System.out.print(head.value + " ");
		preOrderRecur(head.right);
	}
	public static void posOrderRecur(Node head) {
		if (head == null) {
			return;
		}
	
		preOrderRecur(head.left);
		preOrderRecur(head.right);
		System.out.print(head.value + " ");
	}
	
	public static void preOrderUnRecur(Node head) {
		System.out.println("pre_order:");
		if (head != null) {
			Stack<Node> stack = new Stack<Node>();
			stack.add(head);
			while (!stack.isEmpty()) {
				head = stack.pop();
				System.out.print(head.value+ " ");
				if (head.right != null) {
					stack.push(head.right);
				}
				if (head.left != null) {
					stack.push(head.left);
				}
			}
		}
		System.out.println();
	}
	public static void inOrderUnRecur(Node head) {
		System.out.println("in_order");
		if (head != null) {
			Stack<Node> stack = new Stack<Node>();
			while (!stack.isEmpty() || head != null) {
				if (head != null) {
					stack.push(head);
					head = head.left;
				}else {
					head = stack.pop();
					System.out.print(head.value+ " ");
					head = head.right;
				}
			}
		}
		System.out.println();
	}
	
	public static void posOrderUnrRecur(Node head) {
		System.out.println("pos_order:");
		if (head != null) {
			Stack<Node> stack1 = new Stack<Node>();
			Stack<Node> stack2 = new Stack<Node>();
			stack1.push(head);
			while (!stack1.isEmpty()) {
				head = stack1.pop();
				stack2.push(head);
				if (head.left != null) {
					stack1.push(head.left);
				}
				if (head.right != null) {
					stack1.push(head.right);
				}
			}
		}
	}
}
