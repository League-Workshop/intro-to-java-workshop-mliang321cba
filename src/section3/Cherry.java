package section3;

import javax.swing.JOptionPane;

public class Cherry {
	public static void main(String[] args) {
		String carrot = JOptionPane.showInputDialog("What's going on?");
		if(carrot.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "Really?");
		}
		else {
		JOptionPane.showMessageDialog(null, carrot + ". That sounds exciting.");
	}
}
}
