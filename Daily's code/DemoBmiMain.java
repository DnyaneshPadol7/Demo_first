package com.BmiMain;

import com.bmiProcess.ProcessBMI;

import bmi.data.BmiDataCapture;

public class DemoBmiMain {

	public static void main(String[] args) {
		

	// create an object and passing the values
		BmiDataCapture bmi = new BmiDataCapture(1.65f,68.0f); 
		
	// process BMI according to your body
		ProcessBMI pbmi = new ProcessBMI();
	
		
	// Direct category print
		pbmi.showBMI(bmi);
				

	}

}
