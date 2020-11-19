package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class NameReadMe {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you in years?");
	int ageAsInt = Integer.parseInt(age);
	if (ageAsInt >= 18) { 
		JOptionPane.showInputDialog("Who should be the new president?");
	}
	
	else {
		
	
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}
	
}
}
