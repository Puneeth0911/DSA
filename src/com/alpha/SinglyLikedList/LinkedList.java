package com.alpha.SinglyLikedList;

public class LinkedList {
	Node head;
	int length;

	public void add(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			length++;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
		length++;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			length--; 
			return;
		}   
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		length--;
	}

	public void addAtBegin(int data) {
		Node nn = new Node(data);
//		if(head==null) {
//			head=nn;
//			length++;
//			return;
//		}
		nn.next = head;
		head = nn;
		length++;
	}

	public void deleteAtBegin() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
	}

	public void addAtIndex(int data, int index) {
		if (index < 0 || index > length) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			addAtBegin(data);
			return;
		}
		Node nn = new Node(data);
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		nn.next = temp.next;
		temp.next = nn;
		length++;
	}

	public void updateAtIndex(int data, int index) {
		if (index < 0 || index >= length) {
			System.out.println("Invalid index");
			return;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.data = data;
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= length) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			deleteAtBegin();
			return;
		}
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		Node del = temp.next;
		temp.next = temp.next.next;
		del.next = null;
		length--;
	}
}
