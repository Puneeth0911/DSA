package com.alpha.DoublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	private int length;

	public void add(int data) {
		Node nn = new Node(data);
		if (head == null && tail == null) {
			head = tail = nn;
			length++;
			return;
		}
		tail.next = nn;
		Node temp = tail;
		tail = nn;
		tail.prev = temp;
		length++;
	}

	public void addAtBegin(int data) {
		Node nn = new Node(data);
		if (head == null && tail == null) {
			head = tail = nn;
			length++;
			return;
		}
		head.prev = nn;
		nn.next = head;
		head = nn;
		length++;
	}

	public void insertAtIndex(int index, int data) {
		Node nn = new Node(data);
		if (index < 0 || index > length) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			addAtBegin(data);
			return;
		}
		if (index == length) {
			add(data);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node nexttemp = temp.next;
		temp.next = nn;
		nn.prev = temp;
		nn.next = nexttemp;
		nexttemp.prev = nn;
		length++;
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head == tail) {
			head = tail = null;
			length--;
			return;
		}
		Node temp = tail;
		tail = tail.prev;
		tail.next = null;
		temp.prev = null;
		length--;
	}

	public void deleteAtBegin() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head == tail) {
			head = tail = null;
			length--;
			return;
		}
		Node temp = head;
		head = head.next;
		head.prev = null;
		temp.next = null;
		length--;
	}

	public void printListForward() {
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

	public void printListBackward() {
		if (tail == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = tail;
		while (temp.prev != null) {
			System.out.print(temp.data + ", ");
			temp = temp.prev;
		}
		System.out.println(temp.data);
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
	    if (index == length - 1) {
	        deleteAtEnd();
	        return;
	    }
	    Node temp = head;
	    for (int i = 0; i < index; i++) {
	        temp = temp.next;
	    }
	    temp.prev.next = temp.next;
	    temp.next.prev = temp.prev;
	    temp.next = null;
	    temp.prev = null;
	    length--;
	}

	public void updateAtIndex(int index, int data) {
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

	public int getLength() {
		return length;
	}
}
