package ChapterSixExercises;
import java.util.Scanner;

public class IntegerPower 
{
	public static void main(String[] args)
	{ 
		Scanner keyBoard = new Scanner(System.in);
		
		// prompt user to enter base
		System.out.println("Enter the base: ");
		int base = keyBoard.nextInt();
		
		// prompt user to enter power
		System.out.println("Enter the power: ");
		int exponent = keyBoard.nextInt();
		
		System.out.println(integerPower(base, exponent));
	}

	
	public static int integerPower(int base, int exponent) 
	{
		int result = 1;
		
		while (exponent != 0)
		{
			result = result * base ;
			
			exponent--;
		}
		System.out.print("Result is: ");
		return result;
	} 
}
