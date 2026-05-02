package com.EmiMain;

import com.EmiData.EmiDataCapture;
import com.EmiProcess.ProcessEmiData;

public class DemoEmiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// putting the values in the variables
		EmiDataCapture emi = new EmiDataCapture(500000,8,2);
		
		
	//process the Emi calculations
		ProcessEmiData data = new ProcessEmiData();
		double result = data.emi(emi);
	
			System.out.println("your Emi Calculation is :"+result);
		

	}

}
