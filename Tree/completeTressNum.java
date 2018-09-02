package Tree;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class completeTressNum {
	public static class Node{
		public int value;
		public Node left;
		public Node right;
		public Node(int data) {
			this.value = data;
		}
	}
	public static int nodeNum(Node head) {
		if (head == null) {
			return 0;
		}
		return bs(head, 1, mostLeftLevel(head, 1));
	}
	public static int bs(Node node,int level,int h) {
		if (level == h) {
			return 1;
		}
		if (mostLeftLevel(node.right, level+1) == h) { //单前节点的右子树的最左节点到达最后一层
			return (1 << (h - level)) + bs(node.right, level+1, h);
		}else {
			return (1 << (level - h - 1)) + bs(node.left, level+1, h);
		}
	}
	public static int mostLeftLevel(Node node,int level) {//单前节点最左节点是第几层
		while (node != null) {
			level++;
			node = node.left;
		}
		return level - 1;
		
	}
}

