package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random gen=new Random();
	int number=gen.nextInt(4);
	// 3. Print out this variable
System.out.println(number);
	// 4. Get the user to enter something that they think is awesome
String input=JOptionPane.showInputDialog("Type something awesome");
	// 5. If the random number is 0
if(number==0) {
	
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog(null, "That's Awesome!");
}	// 6. If the random number is 1
if(number==1) {
	// -- tell the user whatever they entered is ok.
JOptionPane.showMessageDialog(null," That's Ok.");
	// 7. If the random number is 2
}
if(number==2) {
	// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null, "That's Boring.");
	// 8. If the random number is 3
if(number==3) {
	// -- write your own answer
JOptionPane.showMessageDialog(null, "THAT IS SO STUPID!!");
}

}
}
}