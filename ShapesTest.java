package ChapterFive;
// Obtaining user input and creating a JFrame to create Shapes. 
import javax.swing.JFrame; // handle the display 
import javax.swing.JOptionPane; 

public class ShapesTest 
{
	public static void main(String[] args) 
	{
	  // obtain user's choice 
		String input = JOptionPane.showInputDialog(
			"Enter 1 to draw Rectangles\n" + 
			"Enter 2 to Draw Ovals");
		
		int choice = Integer.parseInt(input); //converts input to int 
		
		// create the panel with the user's input 
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); // creates a new JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
		application.areFocusTraversalKeysSet(choice);
	}
} // end class ShapesTest
