package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name=JOptionPane.showInputDialog(null,"Who Do You Not Like");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on! " +name);
		// 3. Ask the user for the name of their best friend
String name2=JOptionPane.showInputDialog("What is The Name of your Best Freind");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null,name2+  " Is Sweet As Candy");
	} 
}



