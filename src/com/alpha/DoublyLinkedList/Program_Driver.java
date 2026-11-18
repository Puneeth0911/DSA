package com.alpha.DoublyLinkedList;

public class Program_Driver {
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
//		dll.addAtBegin(5);
//		dll.addAtBegin(1);
		dll.insertAtIndex(2,25);
		dll.deleteAtIndex(3);
		dll.updateAtIndex(2,28);
//		dll.deleteAtEnd();
//		dll.deleteAtBegin();
		
		dll.printListForward();
//		dll.printListBackward();
	}
}
