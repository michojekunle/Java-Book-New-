package ChapterSix;
// Test application that displays a frownie face.
import javax.swing.JFrame;
public class DrawFrownyFaceTest
{  
	public static void main(String[] args)
	{
		 DrawFrownyFace panel = new DrawFrownyFace(); 
		 JFrame application = new JFrame();
		 
		 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 application.add(panel);
		 application.setSize(250, 250); 
		 application.setVisible(true);
	}
}// draw a frownie face test 

	