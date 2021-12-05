package ChapterFive;
// Drawing a cascade of shapes based on the user's choice.
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel  
{
	private int choice ; // user's choice of which shape to draw 
	
	// constructor sets the user's choice
	public Shapes(int userChoice)
	{
		choice = userChoice ;
	}

	
	// draws a cascade of shapes starting from the top left corner 
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int i = 1; i < 10; i++)
		{
			// pick the shape based on the user's choice 
			switch (choice)
			{
				case 1: //draw rectangles 
					g.drawRect(10 + i * 10, 10 + i * 10,
						50 + i * 10, 50 + i * 10 );
					break; 
				case 2 : //draw ovals 
					g.drawOval(10 + i * 10 , 10 + i * 10,
						50 + i * 50,  50 + i * 50);
					break; 
				case 4 :
					g.drawRoundRect(10 + i * 10, 10 + i *20,
							20 + i * 20, i * 50 , i * 30, 10 + i * 20);
					break;
			}
		}
		
		int i = 1;
		
		while (i <= 100) 
		{
			while(i <= 12) 
			{
				i++;
				g.drawOval(10 + i * 10, 10 + i * 10,
						10 + i * 10, 10 + i * 10);
			}
		g.create(26, 32 * i, 11 * i, 22 * i);
		}
	}
} // end class Shapes		