package ChapterThree;

import javax.swing.JOptionPane;

public class NameDialog 
{
	public static void main(String[] args) 
	{
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("What is your Name?");
		 
		// create a message
		String message = String.format("Welcome, %s to java Programming!", name);
		
		// display the message to welcome the user by name 
		JOptionPane.showMessageDialog(null, message);
	} // end main
} // end class NameDialog
