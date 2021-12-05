package ChapterSix;
// drawing a smiley face using colours and filled shapes.
import java.awt.Color; 
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		// draw the face
		g.setColor(Color.orange);
		g.fillOval(10, 10, 200, 200);
		
		// Draw the eyes
		g.setColor(Color.yellow); 
		g.fillOval(55, 65, 30, 30); 
		g.fillOval(135, 65, 30, 30);
		
		// draw the mouth
		g.fillOval(50, 110, 120, 60 );
		
		// "touch up" the mouth into a smile
		g.setColor(Color.orange); 
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
		
		// fix a nose
		g.setColor(Color.yellow); 
		g.fillRect(95, 110 , 30, 20);
	}
} // end class DrawSmiley