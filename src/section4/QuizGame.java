package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is the 5th letter of the alphabet?");
		// 3.  Use an if statement to check if their answer is correct
		if(input.equalsIgnoreCase("e")) {
			JOptionPane.showMessageDialog(null, "That's correct.");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "That's incorrect.");
		}
		String input2 = JOptionPane.showInputDialog("What is the color opposite to purple?");
		if(input2.equalsIgnoreCase("yellow")) {
			JOptionPane.showMessageDialog(null, "That's correct.");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "That's incorrect.");
		}
			String input3 = JOptionPane.showInputDialog("What is the square root of 16?");
			if(input3.equalsIgnoreCase("four")|| input3.equalsIgnoreCase("4")) {
				JOptionPane.showMessageDialog(null, "That's correct.");
				score = score + 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "That's incorrect.");
		}
			String input4 = JOptionPane.showInputDialog("Who was the first president of the United States?");
			if(input4.equalsIgnoreCase("George Washington")) {
				JOptionPane.showMessageDialog(null, "That's correct.");
				score = score + 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "That's incorrect.");
			}
			String input5 = JOptionPane.showInputDialog("Who invented the light bulb?");
			if(input5.equalsIgnoreCase("Thomas Edison")) {
				JOptionPane.showMessageDialog(null, "That's correct.");
				score = score + 1;
			}
			else {
				JOptionPane.showMessageDialog(null, "That's incorrect.");
			}
				System.out.println(score);
			
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}

