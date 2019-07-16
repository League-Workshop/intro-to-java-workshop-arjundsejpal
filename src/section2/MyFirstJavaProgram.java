package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot monkamachine=new Robot();
	monkamachine.sparkle();
	monkamachine.penDown();
	monkamachine. setSpeed (100);
	
	for(int i=0; i <4;i++) {
		monkamachine.turn (90);
		monkamachine.move(200);
	}
	
	}
}
