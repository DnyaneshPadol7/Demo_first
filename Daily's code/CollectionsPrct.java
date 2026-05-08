package com.homework;

import java.util.ArrayList;

public class CollectionsPrct {

	public static void main(String[] args) {
		
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("Dnyanesh");
		Name.add("Piyush");
		Name.add("Abhishek");
		Name.add("Rohit");
		Name.add("Pavan");
		System.out.println(Name);
		Name.add("Shubham");
		System.out.println(Name);
		Name.remove(4);
		System.out.println(Name);				// Prints the Elements of the array 
	
		System.out.println(Name.get(0));		// Prints the specific element of the array. 
		System.out.println(Name.size());		// Gives the total no. of  elements of the array.
		
		System.out.println("\nRemoving specific Element");
		Name.remove(4);			// Removes the particular elements from an array.
		System.out.println(Name);

		Name.clear(); 		// Clears all the Elements of the array (delete all the data of array).
		System.out.println(Name);
		
		
	}

}
