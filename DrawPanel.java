package ChapterFour;
//Using DrawLine to connect the corners of a panel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	
	//draw an X from the corners of the panel 
	public void paintComponent(Graphics g)
	{
		//call the paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		int width = getWidth(); // total Width
		int height = getHeight(); // total height 
		
		// draw a line from the upper-left to the lower-right 
		g.drawLine(8, 16, width, height);
		g.drawArc(width, height, width, height, width, height);
		
		
		// draw a line from the lower-left to the upper-right 
		g.drawLine(8, height, width , 16);
		
		g.setColor(getBackground());
	}
}
