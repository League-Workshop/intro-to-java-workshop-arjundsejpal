package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	Robot monkamachine=new Robot();	
void go () {
	// 2. Create a new Robot
	
	
	
		// 4. Make the robot move as fast as possible
monkamachine.setSpeed(1000);
		// 5. Set the pen width to 5
monkamachine.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i=0; i<4;i++) {
			// 7. Set the pen color to random
	monkamachine.setRandomPenColor();
			// 1. Call the drawSquare() method
	monkamachine.penDown();
drawSquare();
		
		
		
		
		
			// 8. Turn the robot 90 degrees to the right
monkamachine.turn(90);
}
		
		
		
		
		
		
		
		
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i=0; i<4;i++) {
	monkamachine.move(200);	
	monkamachine.turn (90);
		}
	}
	public static void main(String[] args) {
		new FourSquare().go();
	}

}



