package LinkedList;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import sun.net.smtp.SmtpClient;

public class smallEqualbigger {
	public static class Node {
		public int value;
		public Node next;
		public Node(int data) {
			this.value = data;
		}
	}
	
	public static Node listPartition1(Node head,int num) {
		if (head == null) {
			return head;
		}
		Node cur = head;
		int i = 0;
		while (cur != null) {
			i++;
			cur = cur.next;
		}
		Node[] nodeArr = new Node[i];
		i = 0;
		cur = head;
		for (int j = 0; j != nodeArr.length; j++) {
			nodeArr[j] = cur;
			cur = cur.next;						//Êý×éÐÍ
		}
		arrPartition(nodeArr, num);
		for (int j = 1; j != nodeArr.length; j++) {
			nodeArr[i-1].next = nodeArr[i];
		}
		nodeArr[i-1].next = null;
		return nodeArr[0];
	}
	public static void arrPartition(Node[] nodeArr,int num) {
		int small = -1;
		int big = nodeArr.length;
		int index = 0;
		while (index != big) {
			if (nodeArr[index].value < num) {
				swap(nodeArr, ++small, index++);
			}else if (nodeArr[index].value == num) {
				index++;
			}else {
				swap(nodeArr, --big, index);
			}
		}
	}
	public static void swap(Node[] arr,int a,int b) {
		Node tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	public static Node listPartition2(Node head,int num) {
		Node smallHead = null;
		Node smallTail = null;
		Node equalHead = null;
		Node equalTail = null;
		Node bigHead = null;
		Node bigTail = null;
		Node next = null;
		while (head != null) {
			next = head.next;
			head.next = null;
			if (head.value < num) {
				if (smallHead == null) {
					smallHead = head;
					smallTail = head;
				}else {
					smallTail.next = head;
					smallTail = head;
				}
			}else if (head.value == num) {
				if (equalHead == null) {
					equalHead = head;
					equalTail = head;
				}else {
					equalTail.next = next;
					equalTail = head;
				}
			}else {
				if (bigHead == null) {
					bigHead = head;
					bigTail = head;
				}else {
					bigTail.next = head;
					bigTail = head;
				}
			}
			head = next;
		}
		if (smallTail != null) {
			smallTail.next = equalHead;
			equalTail = equalTail == null ? smallTail : equalTail;
		}
		if (equalTail != null) {
			equalTail.next = bigHead;
		}
		return smallHead != null ? smallHead : equalHead != null ? equalHead : bigHead;
	}
}
