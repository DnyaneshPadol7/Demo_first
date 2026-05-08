package com.homework;

import java.util.ArrayDeque;

public class CollectionArrayDequePrct {

	public static void main(String[] args) {
		
		ArrayDeque<String> Name = new ArrayDeque<>();		// It performs the FIFO Operation
		Name.add("Dnyanesh");
		Name.add("Piyush");
		Name.add("Shubham");
		Name.add("Rohit");
		
		// ArrayDeque supports both Queue (FIFO → add/remove) and Stack (LIFO → push/pop)
		
		System.out.println("Printing before for each loop");
		System.out.println(Name);
		
		Name.remove();
		System.out.println("\n");
		for (String str:Name) {
			System.out.println(str);
		}
		

	}

}
