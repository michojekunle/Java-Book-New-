package ChapterFour;
// solving class average problem using counter-controlled repetition
import java.util.Scanner; //program uses class Scanner  
public class ClassAverage 
{

	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialization phase 
		int total = 0 ; // initialize sum of grades entered by the user
		int gradeCounter = 1; // initialize # of grade to be entered next
		
		// processing phase uses counter-controlled repetition
		while (gradeCounter <= 10)//loop ten times
		{
			System.out.print("Enter grade:");//prompt
			int grade = input.nextInt();// input next Grade
			total = total + grade ;// add Grade to total 
			gradeCounter = gradeCounter + 1; // increment counter by 1
		}
		
		// Termination phase 
		int average = total / 10; //integer division yields integer result 
		
		/// Display total and average of grades 
		System.out.printf("%nTotal of all ten Grades is %d%n", total);
		System.out.printf("Class average is %d%n", average );
	
		// Solving class-average problem using sentinel-controlled Expression
		
		//create a Scanner to obtain input from the command window 
		Scanner input2 = new Scanner(System.in);
		
		// initialization phase 
		int total2 = 0 ; //initialize sum of grades 
		int gradeCounter2 = 0 ; // initialize # of grades entered so far 
		
		// processing phase
		// Prompt for input and read Grade from the user
		System.out.print("Enter Grade or -1 to quit: ");
		int grade2 = input2.nextInt();
		
		//loop until sentinel value read from user
		while (grade2 != -1)
		{
			total2 = total2 + grade2; //add grade2 to total2
			gradeCounter2 = gradeCounter2 + 1 ;//increment counter 
			
			//prompt for input and read next Grade form user
			System.out.print("Enter grade or -1 to quit: ");
			grade2 = input2.nextInt();
		}
		
		//Termination phase
		// if user entered at least one grade ...
		if (gradeCounter2 != 0)
		{
			//use number with decimal point to calculate average of grades 
			double average2 = (double) total2 / gradeCounter2;
			
			// display total and average (with two digits of precision)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter2, total2);
			System.out.printf("Class average is  %.2f%n", average2);
		}
		else //no grades were entered, so output appropriate message
			System.out.println("No grades were entered");
	}
} // end class ClassAverage