package Student_Marks_Management_BST;

public class BinarySearchTree {
	Node root;

	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		} else {
			System.out.println("Duplicates not allowed");
		}
		return root;
	}

	public void search(int data) {
		Node temp = root;
		while (temp != null) {
			if (data == temp.data) {
				System.out.println("Element found");
				return;
			} else if (data < temp.data) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		System.out.println("No such element");
	}

	public void ascendingOrder(Node root) {
		if (root == null) {
			return;
		}
		ascendingOrder(root.left);
		System.out.print(root.data + " ");
		ascendingOrder(root.right);
	}

	public void findHighestAndLowest() {
		if (root == null) {
			System.out.println("Tree is empty");
			return;
		}
		Node min = root;
		Node max = root;
		while (min.left != null) {
			min = min.left;
		}
		while (max.right != null) {
			max = max.right;
		}
		System.out.println("\nLowest marks: " + min.data);
		System.out.println("Highest marks: " + max.data);
	}

	public Node delete(Node root, int data) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left = delete(root.left, data);
		} else if (data > root.data) {
			root.right = delete(root.right, data);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				Node temp = root.right;
				while (temp.left != null) {
					temp = temp.left;
				}
				root.data = temp.data;
				root.right = delete(root.right, temp.data);
			}
		}
		return root;
	}
}
