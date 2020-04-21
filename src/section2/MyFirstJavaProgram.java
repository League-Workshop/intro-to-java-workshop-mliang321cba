package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		// START HERE
	Robot john = new Robot("mini");
john.setPenColor(Color.MAGENTA);
	john.penDown();
	john.setPenWidth(1);
	john.setSpeed(10);
	//john.hide();	
	john.sparkle();
	for(int i = 0; i < 6; i++) {
		john.move(80);
		john.turn(360/6);
	}

	}
}
