package com.elec.impl;

import com.elec.tarrif.DomesticTarrif;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetElecBill refr = new GetElecBill();
		
		DomesticTarrif ref;
		ref = new DomesticTariff_Implement(111,"java");
		// calc the total coast
		int cost = ref.getBill(111);
		System.out.println("Electricity without GST "+ cost);
		System.out.println("Total Electricity Bill With GST"+refr.GetElectBill(60));
		
	}

}
