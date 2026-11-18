package com.alpha.binarySearchTree;

public class ProgramDriver {
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.root=bst.add(bst.root,50);
		bst.root=bst.add(bst.root,30);
		bst.root=bst.add(bst.root,70);
		bst.root=bst.add(bst.root,20);
		bst.root=bst.add(bst.root,40);
		bst.root=bst.add(bst.root,60);
		bst.root=bst.add(bst.root,80);
		
        System.out.println("InOrder:");
        bst.inOrder(bst.root);

        System.out.println("\nPreOrder:");
        bst.preOrder(bst.root);

        System.out.println("\nPostOrder:");
        bst.postOrder(bst.root);
	}
}
