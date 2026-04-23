package com.EmiProcess;

import com.EmiData.EmiDataCapture;

public class ProcessEmiData {

	public ProcessEmiData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double emi(EmiDataCapture em) {
		double r = (em.r/12)/100;
		double n =em.n*12;
		double EMI= (em.p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r,n) - 1);
		
		return EMI;
	}
}
