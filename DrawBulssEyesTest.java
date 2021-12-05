package ChapterSixExercises;
import javax.swing.JFrame;
// test apllication for drawing a bulls eyes
public class DrawBulssEyesTest 
{
	public static void main(String[] args)
	{
		DrawBullsEyes panel = new DrawBullsEyes();
		JFrame application = new JFrame ();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}
} // end class DrawBullsEyesTest.