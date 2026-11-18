package com.alpha.HashMap;

public class ProgramDriver {
	public static void main(String[] args) {
		HashMap h=new HashMap(5);
		h.put(101,"Allen");
		h.put(102,"Kevin");
		h.put(103,"Amit");
		h.put(107,"Mahesh");
		h.put(112,"Ram");
		h.put(113,"Sham");
		h.put(107,"Raghu");
		h.put(104,"Abhay");
		h.put(112,"Unknown");
		
		System.out.println(h.get(103));
		System.out.println(h.contains(103));
		h.remove(112);
		
//		System.out.println(h.buckets[2].value);
//		System.out.println(h.buckets[2].next.value);
//		System.out.println(h.buckets[2].next.next.value);
//		System.out.println(h.buckets[2].next.next.next.value);
	}
}
