package ChapterThree;

import javax.swing.JOptionPane;

public class AddtionDialog 
{
	public static void main(String[] args) 
	{
		// prompt user to enter name
		String number1 = JOptionPane.showInputDialog( "Input the First Number: ");
		String number2 = JOptionPane.showInputDialog("Input the Second Number: ");
		
		// create an Addition
		String sum = number1 + number2;
		
		// display the message to welcome the user by name 
		JOptionPane.showMessageDialog(null, sum);
	} // end main

} // end class AdditionDialog

	


