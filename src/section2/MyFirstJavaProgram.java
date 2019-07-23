package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bob=new Robot();
		bob.setSpeed(100);
		for(int i=0;i<4;i++) {
		bob.setRandomPenColor();
		bob.penDown();
		bob.move(200);
		bob.turn(90);
		}
	}
}

