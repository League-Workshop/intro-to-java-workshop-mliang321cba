package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String input1 = JOptionPane.showInputDialog("Enter an adjective.");
		// Get the user to enter a type of liquid
		String input2 = JOptionPane.showInputDialog("Enter a type of liquid.");
		// Get the user to enter a body part
		String input3 = JOptionPane.showInputDialog("Enter a body part.");
		// Get the user to enter a verb
		String input4 = JOptionPane.showInputDialog("Enter a verb that ends in ing.");
		// Get the user to enter a place
		String input5 = JOptionPane.showInputDialog("Enter a place.");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Piranhas are more " + input1 + " during the day, so cross the river at\n"
				+" night. Piranhas are attracted to fresh " + input2 + " and will most\n"
				+" likely take a bite out of your " + input3 + " if you are " + input4 + ". Whatever\n"
				+" you do, if you have an open wound, try to find another way to get\n "
				+" back to the " + input5 + ". Good luck!");
		
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

