package ChapterSix;
//Programmer-declared method maximum with three double parameters.
import java.util.Scanner;

public class MaximumFinder
{
	// obtain three floating-point values and locate the 
	public static void main(String[] args) 
	{
		// create Scanner for input from command window 
		Scanner input = new Scanner(System.in);
		
		// prompt for and input three floating point numbers
		System.out.print(
				"Enter three floating-point values seperated by spaces: ");
		double number1 = input.nextDouble(); // read first double 
		double number2 = input.nextDouble(); // read second double
		double number3 = input.nextDouble(); // read third double 
		
		// determine the maximum value 
		double result = maximum(number1, number2, number3);
		
		// display the maximum1 value 
		System.out.println("Maximum is: " + result);
		
		// prompt for and input three floating point numbers
		System.out.print(
				"Enter three floating-point values seperated by spaces: ");
		double number4 = input.nextDouble(); // read fourth double 
		double number5 = input.nextDouble(); // read fifth double 
		double number6 = input.nextDouble(); // read sixth double 
		
		double result1 = maximum1(number4, number5, number6);
		
		// display the maximum 1 value
		System.out.println("Maximum1 is: " + result1);
	}
	
	//returns the maximum of its three double parameters 
	public static double maximum(double x, double y, double z)
	{
		double maximumValue = x; //assume x is the largest to start
		
		//determine whether y is greater than the maximumValue
		if (y > maximumValue)
			maximumValue = y; 
		
		// determine whether z is greater than maximumValue 
		if (z > maximumValue)
			maximumValue = z;
		
		return maximumValue;
	}
	
	public static double maximum1(double x, double y, double z)
	{
		return Math.max(x, Math.max(y, z));
	}
} // end class MaximumFinder