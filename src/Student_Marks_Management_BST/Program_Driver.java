package Student_Marks_Management_BST;

public class Program_Driver {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 30);
		bst.root = bst.insert(bst.root, 75);
		bst.root = bst.insert(bst.root, 29);
		bst.root = bst.insert(bst.root, 45);
		bst.root = bst.insert(bst.root, 70);
		bst.root = bst.insert(bst.root, 99);

		bst.search(99);
		bst.ascendingOrder(bst.root);
		bst.findHighestAndLowest();
		bst.root = bst.delete(bst.root, 75);
		System.out.println("After Deletion:");
		bst.ascendingOrder(bst.root);
	}
}
