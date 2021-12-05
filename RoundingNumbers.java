package ChapterSixExercises;
//Program that round number to the nearest integer
import java.util.Scanner;

public class RoundingNumbers 
{  
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double y;
		double x;
		final double input;
		
		System.out.println("Enter the number of values that is to be rounded up: ");
		input = keyboard.nextDouble(); 
		
		// prompt the user to input value 
		for (int count = 1; count<=input; count++) 
		{
			System.out.println("Enter the value that is to be rounded up: ");
			x = keyboard.nextDouble();
			y = Math.floor(x + 0.5); 
			
			System.out.println("Value that is to be rounded up: " + x);
			System.out.println("Rounded-up Value: " + y);
		}
	}// end method main
} //end class RoundingNumbers
