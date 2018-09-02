package LinkedList;
/**
 * �����������������ͷָ��head1��head2����ӡ����
 * ����Ĺ������֡�
 * @author Administrator
 *
 */
public class printCommonPartInLink {
	public static class Node{
		public int value;
		public Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	public static void printCommonPart(Node node1,Node node2) {
		System.out.println("common part:");
		while (node1 != null && node2 != null) {
			if (node1.value < node2.value) {
				node1 = node1.next;
			}else if (node1.value > node2.value) {
				node2 = node2.next;
			}else {
				System.out.print(node1.value + " ");
				node1 = node1.next;
				node2 = node2.next;
			}
		}
		System.out.println();
	}
	public static void printLinkList(Node node) {
		System.out.println("LinkedList:");
		while (node != null) {
			System.out.print(node.value+" ");
			node = node.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node node1 = new Node(2);
		node1.next = new Node(3);
		node1.next.next = new Node(5);
		node1.next.next.next = new Node(9);
		
		Node node2 = new Node(3);
		node2.next = new Node(4);
		node2.next.next = new Node(9);
		node2.next.next.next = new Node(12);
		printLinkList(node1);
		printLinkList(node2);
		printCommonPart(node1, node2);
	}
}
