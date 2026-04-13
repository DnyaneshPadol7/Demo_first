package com.user.input;

import com.Final.DemoFinalNotes;
import com.Interface.DemoInterfaceNotes;
import com.Static.DemoStaticNotes;
import com.Super.DemoSuperNotes;
import com.abstraction.DemoAbstrnNotes;
import com.classes.DemoClassNotes;
import com.constructor.DemoConstructorNotes;
import com.encapsulation.DemoEncapsulationNotes;

public class DemoUserInput {

	public void start() {
		int ch = 0;
		while (ch != 9) {

			try {
				System.out.println("Welcome to Java Notes :)\n");
				System.out.println("Press 1 for Java Class Notes \n" 
				+ "Press 2 for Constructor Notes \n"
				+ "Press 3 for Abstraction Notes \n" 
				+ "Press 4 for Encapsulation Notes \n"
				+ "Press 5 for Interface Notes \n" 
				+ "Press 6 for Static Notes \n"
				+ "Press 7 for Super Notes \n" 
				+ "Press 8 for Final Notes \n" 
				+ "Press 9 for Exit ");

				ch = System.in.read(); // taking input using read function
				ch = ch - 48; // converts ascii to number
				System.in.read();  // clearing buffer for precise output

				switch (ch) {

				case 1: {
					DemoClassNotes notes = new DemoClassNotes();
					notes.showNotes();
					break;
				}

				case 2: {
					DemoConstructorNotes notes = new DemoConstructorNotes();
					notes.showNotes();
					break;
				}

				case 3: {
					DemoAbstrnNotes notes = new DemoAbstrnNotes();
					notes.showNotes();
					break;
				}

				case 4: {
					DemoEncapsulationNotes notes = new DemoEncapsulationNotes();
					notes.showNotes();
					break;
				}

				case 5: {
					DemoInterfaceNotes notes = new DemoInterfaceNotes();
					notes.showNotes();
					break;
				}

				case 6: {
					DemoStaticNotes notes = new DemoStaticNotes();
					notes.showNotes();
					break;
				}

				case 7: {
					DemoSuperNotes notes = new DemoSuperNotes();
					notes.showNotes();
					break;
				}

				case 8: {
					DemoFinalNotes notes = new DemoFinalNotes();
					notes.showNotes();
					break;
				}

				case 9: {
					System.out.println("Exiting the From Notes");
					break;
				}

				default: {
					System.out.println("Invalid Choice");
				}
				}

			} catch (Exception e) {
				System.out.println("Error occurred");
			}
		}
	}

}
