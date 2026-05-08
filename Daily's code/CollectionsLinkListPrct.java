package com.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLinkListPrct {

	public static void main(String[] args) {

		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Dnyanesh");
		Name.add("Piyush");
		System.out.println("Printing the Array before adding new Element");
		System.out.println(Name);
		
		
		Name.add("Pavan");	// Adding the new to the same Element 
		/* ** but Whenever we Adds new elements to the array it will add at end of element 
			  if we have to add element at the starting of the array we should use addFirst function ** */
		
		System.out.println("\nPrinting the Array After adding the new Element: ");
		System.out.println(Name);

		Name.addFirst("The Viki"); // This function helps to add the element at the Starting.
		System.out.println(Name);
		
		Name.addLast("Ganesh\n\n"); // This function helps to add the element at the Ending of the Array And this is the best practise.
		System.out.println(Name);
		
		Name.add(0,"Krishn"); 	// we can add the Element at any spesific position using Indexing 
		System.out.println(Name);
		
		Name.remove(); // When we use Remove Method without pointing at any index then remove method removes the first element by default
		System.out.println(Name);
		
		Name.remove(4); 	// Also we can Remove the Element at any spesific position using Remove Method Indexing 
		System.out.println(Name);
		

		
		System.out.println("\nGives total no. of Element = "+Name.size()); // 
		
		// Name.clear();	// Deletes all the Elements usnig clear function  
		System.out.println("\nGives total no. of Element = "+Name.size()+"\n"); //
		
		System.out.println("Printing all the elements using the for each loop\n");
		
		for (String str:Name) 
		{
			System.out.println(str);
		}
		
		

	}

}
