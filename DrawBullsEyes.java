package ChapterSixExercises;
// application that draws a bull's eyes
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawBullsEyes extends JPanel 
{
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);

			int x = 130;  // x,y of top left corner for drawing circles
	        int y = 130;
	         
	        for (int i=8; i>0; i--) 
	        {
	            if (i%2 == 0) 
	            {
	                g.setColor(Color.gray);
	            } 
	            else 
	            {
	                g.setColor(Color.GREEN);
	            }
	            
	            int radius = i * 100/10;  // compute radius of this ring
	            g.fillOval(x-radius, y-radius, radius*2, radius*2);
	        }
	}
}