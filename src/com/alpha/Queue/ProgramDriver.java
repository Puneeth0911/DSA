package com.alpha.Queue;

public class ProgramDriver {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		System.out.println(q.peek());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		q.enqueue(40);
		System.out.println(q.peek());
	}
}
