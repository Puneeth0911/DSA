package com.alpha.HashMap;

public class HashMap {
	Node[] buckets;

	public HashMap(int size) {
		this.buckets = new Node[size];
	}

	public void put(int key, String value) {
		Node nn = new Node(key, value);
		int index = getIndex(key);
		if (buckets[index] == null) {
			buckets[index] = nn;
			return;
		}
		Node temp = buckets[index];
		while (temp != null) {
			if (temp.key == key) {
				temp.value = value;
				return;
			}
			if (temp.next == null) {
				break;
			}
			temp = temp.next;
		}
		temp.next = nn;
	}

	private int getIndex(int key) {
		return key % buckets.length;
	}

	public String get(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
//		if (temp == null) {
//			System.out.println("No such key");
//			return null;
//		}
		while (temp != null) {
			if (temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public boolean contains(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		if (temp == null) {
			System.out.println("No such key");
			return false;
		}
		while (temp != null) {
			if (temp.key == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void remove(int key) {
		int index = getIndex(key);
		Node temp = buckets[index];
		if (temp == null) {
			System.out.println("No such key");
			return;
		}
		if (temp.key == key) {
			buckets[index] = temp.next;
			return;
		}
		while (temp.next != null) {
			if (temp.next.key == key) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		System.out.println("No such key");
	}
}