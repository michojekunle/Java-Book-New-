package ChapterSixExercises;
// rounding numbers higher level
import java.util.Scanner;

public class RoundingNumbersHL 
{
	static double y;
	static double x;
	static double input;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of values that is to be rounded up: ");
		input = keyboard.nextDouble(); 
		
		// prompt the user to input value for it to display results. 
		for (int count = 1; count<=input; count++) 
		{
			System.out.println("Enter the value "+count+ " that is to be rounded up: ");
			x = keyboard.nextDouble();
			
			System.out.println("Value "+count+" that is to be rounded up: " + x);
			System.out.println();
			System.out.println(roundToInteger(x));
			System.out.println(roundToTenths(x));
			System.out.println(roundToHundredths(x));
			System.out.println(roundToThousandths(x));
			System.out.println();
		}
		
	}// end method main
		
	public static double roundToInteger(double number)
	{
		y = Math.floor(x + 0.5) ; 
		System.out.print("Rounded-up to nearest integer\nResult is: ");
		return y;
	}

	public static double roundToTenths(double number)
	{
		y = Math.floor(x * 10 + 0.5) / 10; 
		System.out.print("Rounded-up to nearest Tenths\nResult is: ");
		return y;
	}
	
	public static double roundToHundredths(double number)
	{
		y = Math.floor(x * 100 + 0.5) / 100; 
		System.out.print("Rounded-up to nearest Hundredths\nResult is: ");
		return y;
	}
	
	public static double roundToThousandths(double number)
	{
		y = Math.floor(x * 1000 + 0.5) / 1000; 
		System.out.print("Rounded-up to nearest Thousandths\nResult is: ");
		return y;
	}
}// end class RoundingNumbersHL