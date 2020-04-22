package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String candy = JOptionPane.showInputDialog(null, "Who do you dislike?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You have a crush on " + candy + ".");
		// 3. Ask the user for the name of their best friend
		String friend = JOptionPane.showInputDialog("Who is your best friend?");
		if( friend.equalsIgnoreCase("no one") || friend.equalsIgnoreCase("Nobody") ) {
			JOptionPane.showMessageDialog(null, "That's sad.");
		}
		// 4. Tell them their best friend is as sweet as candy
		else {
		JOptionPane.showMessageDialog(null, "Really? " + friend + " is as sweet as candy!");
	} 
}
}



