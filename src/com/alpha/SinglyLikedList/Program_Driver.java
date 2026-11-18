package com.alpha.SinglyLikedList;

public class Program_Driver {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);

//		l1.deleteAtEnd();
//		l1.printList();

		l1.addAtBegin(5);
		l1.printList();
//		l1.deleteAtBegin();
//		l1.printList();

//		l1.addAtIndex(25,2);

		l1.updateAtIndex(25, 3);
		l1.deleteAtIndex(2);
		l1.printList();
	}
}
