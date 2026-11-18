package com.alpha.DoublyEndedQueue;

public class ProgramDriver {
	public static void main(String[] args) {
		DoublyEndedQueue d=new DoublyEndedQueue();
		d.frontEnqueue(10);
		d.frontEnqueue(20);
		d.frontEnqueue(30);
		d.rearEnqueue(40);
		d.rearEnqueue(50);
		d.frontDqueue();
		d.rearDqueue();
		d.frontPeek();
		d.rearPeek();
	}
}
