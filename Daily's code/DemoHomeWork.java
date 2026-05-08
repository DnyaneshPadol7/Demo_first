package com.homework;

public class DemoHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applyLiecense user = new applyLiecense("Dnyanesh");
		try {
			user.applyForLiencense(61);
			System.out.println("Inside The Try block");
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Please Apply after "+(18-e.getAge())+" years");
			System.out.println("Inside The catch block");
			e.printStackTrace();
		} catch (overAgeException o) {
			System.out.println("You have corssed Max age Limit"+(60-o.getAge())+" Years");
			System.out.println("Inside The catch block");
		}

	}

}	// Main Method End


class AgeException extends Exception{
	
	//Properties 
	int age;

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(int age) {
		super();
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
}

class overAgeException extends Exception{
	int age;

	public overAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public overAgeException(int age) {
		super();
		this.age = age;
	}
	
	int getAge() {
		return age;
	
}
}

class applyLiecense{
	
	// Properties
	String name;

	// Default Constructor 
	public applyLiecense() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramiterized constructor 
	public applyLiecense(String name) {
		super();
		this.name = name;
	}
	
	void applyForLiencense(int age) throws AgeException,overAgeException {
		if (age < 18) {
			throw new AgeException(age);
		}
		
		else if (age > 60) {
			System.out.println("You have corssed Max Age limit");
			throw new overAgeException(age);
		}
		
		else {
			System.out.println("You're Applicable for Further Process ");

		}
		
	}
	
}
