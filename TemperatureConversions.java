package ChapterSixExercises;

import java.util.Scanner;

public class TemperatureConversions 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// prompt the user to enter either a fahrenheit scale 
		//to get a celsius equivalent and vice versa
		
		System.out.println("Enter the fahrenheit scale to get "
				+ "your celsius equivalent or enter -1 to move to the next:  ");
		double fScale = sc.nextDouble();
		
		if (fScale >= 0)
		{
			System.out.println("Your fahrenheit scale is " + fScale 
					+" and your celsius equivalent is: "+ celsius(fScale));
		}
		else 
		{
			System.out.println("Enter a celsius scale to get" 
				+ " a fahrenheit equivalent: " );
			double cScale = sc.nextDouble();
			
			System.out.println("Your celsius scale is " + cScale 
				+ " and your fahrenheit equivalent is: "+ fahrenheit(cScale));
			
		}
	}
	
	public static double celsius(double fahrenheitScale)
	{
		double celsius;
		double fahrenheit = fahrenheitScale;
		
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		return celsius;
	}
	
	public static double fahrenheit(double celsiusScale)
	{
		double fahrenheit;
		double celsius = celsiusScale;
		
		fahrenheit = 9.0 / 5.0 * (celsius + 32);		
		
		return fahrenheit;
	}
}
