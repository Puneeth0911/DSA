package com.alpha.binarySearchTree;

public class BinarySearchTree {
	Node root;

	public Node add(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = add(root.left, data);
		} else if (data > root.data) {
			root.right = add(root.right, data);
		} else {
			System.out.println("Duplicates not allowed");
		}
		return root;
	}

	// InOrder: Left -> Root -> Right
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// PreOrder: Root -> Left -> Right
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	//PostOrder: Left -> Right -> Root
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}


/*
    // Add without recursion
    public Node add(Node root, int data) {
        Node nn = new Node(data);
        if (root == null) {
            return nn;
        }
        Node temp = root;
        while (true) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = nn;
                    return root;
                }
                temp = temp.left;
            }
            else if (data > temp.data) {
                if (temp.right == null) {
                    temp.right = nn;
                    return root;
                }
                temp = temp.right;
            }
            else {
                System.out.println("Duplicates not allowed");
                return root;
            }
        }
    }
*/
