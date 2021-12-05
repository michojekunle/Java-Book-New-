package ChapterSix;
import java.awt.Color; 
import java.awt.Graphics;
import javax.swing.JPanel;
// draw a frownie face 

public class DrawFrownyFace extends JPanel 
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// draw the face
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 200, 200);
		
		// Draw the eyes
		g.setColor(Color.green); 
		g.fillOval(55, 65, 30, 30); 
		g.fillOval(135, 65, 30, 30);
		
		// draw the mouth
		g.fillOval(50, 130, 120, 60 );
		
		// "touch down" the mouth into a smile
		g.setColor(Color.yellow); 
		g.fillRect(50, 150, 120, 40);
		g.fillOval(50, 140, 120, 50);			
		
		// fix a nose
		g.setColor(Color.green); 
		g.fillRect(95, 100 , 30, 20);		
	}
}
