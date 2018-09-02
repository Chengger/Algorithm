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
			return getLeftMost(node.right);//node右节点不为空，后继节点就是其右子树最左的node。
		}else {
			Node parent = node.parent;
			while (parent != null && parent.left != node) {
				node = parent;			//node右节点为空，向上找node是其parent的左节点的parent。
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
