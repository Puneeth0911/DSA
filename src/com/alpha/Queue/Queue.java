package com.alpha.Queue;

public class Queue {
	Node head;
	Node tail;
	public void enqueue(int data) {
		Node nn=new Node(data);
		if(head==null && tail==null){
			head=tail=nn;
			return;
		}
		tail.next=nn;
		tail=nn;
	}
	
	public int peek() {
		if(head==null) {
			System.out.println("Queue is empty");
			return 0;
		}
		return head.data;
	}
	
	public int dqueue() {
		if(head==null && tail==null) {
			System.out.println("Queue is empty");
			return 0;
		}
		Node temp=head;
		if(head==tail) {
			head=tail=null;
		} else {
			head=head.next;
			temp.next=null;
		}
		return temp.data;
	}
	
}
