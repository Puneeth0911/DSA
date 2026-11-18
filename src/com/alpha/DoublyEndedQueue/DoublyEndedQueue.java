package com.alpha.DoublyEndedQueue;

public class DoublyEndedQueue {
	Node head;
	Node tail;
	public void frontEnqueue(int data) {
		Node nn=new Node(data);
		if(head==null && tail==null) {
			head=tail=nn;
			return;
		}
		tail.next=nn;
		nn.prev=tail;
		tail=nn;
	}
	public void rearEnqueue(int data) {
		Node nn=new Node(data);
		if(head==null && tail==null) {
			head=tail=nn;
			return;
		}
		nn.next=head;
		head.prev=nn;
		head=nn;
	}
	public void frontDqueue() {
		if(head==null) {
			System.out.println("Queue is empty");
			return;
		}
		if(head==tail) {
			head=tail=null;
			return;
		}
		Node temp=head;
		head=head.next;
		head.prev=null;
		temp.next=null;
	}
	public void rearDqueue() {
		if(tail==null) {
			System.out.println("Queue is empty");
			return;
		}
		if(head==tail) {
			head=tail=null;
			return;
		}
		Node temp=tail;
		tail=tail.prev;
		tail.next=null;
		temp.prev=null;
	}
	public void frontPeek() {
		if(tail==null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(tail.data);
	}
	public void rearPeek() {
		if(head==null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println(head.data);		
	}
}
