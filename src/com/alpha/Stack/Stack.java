package com.alpha.Stack;

public class Stack {
	private Node head;

	public void push(int data) {
		Node nn=new Node(data);
//		if(head==null) {
//			head=nn;
//			return;
//		}
		nn.next=head;
		head=nn;
	}

	public int peek() {
		if(head==null) {
			System.out.println("Stack is empty");
			return 0;
		}
		return head.data;
	}

	public int pop() {
		if(head==null) {
			System.out.println("Stack is empty");
			return 0;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		return temp.data;
	}

}
