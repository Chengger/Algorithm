package Tree;

public class SuccessNode {
	public static class Node {
		public int value;
		public Node left;
		public Node right;
		public Node parent;
		public Node(int data) {
			this.value = data;
		}
	}
	public static Node getSuccessNode(Node node) {
		if (node == null) {
			return node;
		}
		if (node.right != null) {
			return getLeftMost(node.right);//node�ҽڵ㲻Ϊ�գ���̽ڵ�����������������node��
		}else {
			Node parent = node.parent;
			while (parent != null && parent.left != node) {
				node = parent;			//node�ҽڵ�Ϊ�գ�������node����parent����ڵ��parent��
				parent = node.parent;
			}
			return parent;
		}
		
	}
	public static Node getLeftMost(Node node) {
		if (node == null) {
			return node;
		}
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
	
}
