package com.homework;

import java.util.Stack;

public class CollectionStackPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> Name = new Stack<>();	// LIFO 
		// Name.add("Dnyanesh"); //	|
		// Name.add("Piyush");	  // 	 }  we can use add method for incerting data into stack memory but the best practice is that you should have to use push method 
		// Name.add("Abishek");  //	|
		
		
		Name.push("Dnyanesh");	//	|
		Name.push("Piyush");	//	 } If you using Stack for storing the data then you shuold use push method bcoz its best practice.
		Name.push("Abhishek");	//	|
		System.out.println(Name+"\n");
		
		Name.pop();
		System.out.println("Priting after poping method \n");
		
		System.out.println("Printing data using for each loop: "); 
		for (String str:Name) {
			System.out.println(str);
		}

	}

}
