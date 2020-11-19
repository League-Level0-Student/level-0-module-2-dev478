package _03_string_conversion._3_rollercoaster;

import java.nio.charset.MalformedInputException;

import javax.swing.JOptionPane;
import javax.swing.*;
public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		String heightToRide = JOptionPane.showInputDialog("Enter your height, in inches.");
		// Uncomment the line below...
			 //
		//
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		//yes i see
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	int heightAsInt = Integer.parseInt(heightToRide);
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    if (heightAsInt >= 48) {
	    	//
	    //
	   JOptionPane.showMessageDialog(null, "Hurray! You are tall enough to ride the coaster alone!");
	    }
	    else if (heightAsInt >= 42) {
	    	JOptionPane.showMessageDialog(null, "You can ride the roller coaster with someone else.");
	    	
	    }
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
	    else {
	    	JOptionPane.showMessageDialog(null, "You must be at least 42 inches tall to ride on the roller coaster pal!");
	    	
	    }
} 
}