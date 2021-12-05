package ChapterFour;
//creating JFrame to display DrawPanel
import javax.swing.JFrame;

public class DrawPanelTest
{
	public static void main(String[] args) 
	{
		
		int m = 1;
		int total = 0;
		
		while (m <= 10)
		{
			int n = m * m;
			System.out.println(n);
			total += n;
			++m;
		}
		
		System.out.printf("Total is %d%n", total);
		
		int w = 1;
		
		int sum3 = 0;
		
		while (w <= 100)
		{
			sum3 += w;
			++w;
			System.out.println(sum3);
		}
		System.out.printf("The sum is: %d%n", sum3);
		
		
		
		int q = 25, 
		rem = q%2;
		q = rem;
		System.out.println(q);
		
		int Q = 25;
		Q %= 2;
		System.out.println(Q);
		
		int y = 1,
				sum = 0;
		sum = sum + y ;
		System.out.printf("The sum is: %d%n", sum);
		
		
		int gender = 2;
		if (gender == 1)
			System.out.println("Woman");
		else
			System.out.println("MAN");;
			
		int x = 15;
		System.out.println(x);
		int total2 = x - --x;
		System.out.print(total2);
		
		//create a panel that contains our drawing 
		DrawPanel panel = new DrawPanel();
		
		//create new Frame to hold the panel
		JFrame application = new JFrame();
		
		//set the Frame to exit when it is closed 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // add the panel to the Frame 
		application.setSize(250, 250); // set the size of the frame 
		application.setVisible(true); // make the frame visible 
		
		
	}
} // end class DrawPanelTest 
