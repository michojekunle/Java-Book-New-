package ChapterSixExercises;
//

import java.util.Scanner;
public class SeperatingDigits 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int integer = scan.nextInt();
		
		if ((integer > 0) && (integer < 99999)) 
		{
			while (integer > 0 && integer < 99999) 
			{
			int i = integer % 10;
			System.out.print(i + "  ");
			
			integer = integer / 10;
			}
		}
		else 
			System.out.println("Try Again later you've entered a wrong input. ");
	}
	
	public static int integerPart(int a, int b) 
	{
		int intPart= 0;
		
	
			intPart = a / 10 ;
			
		return intPart;
	}
	
	public static int remainderPart(int a, int b) 
	{
		int remPart= 0;
		
		if (b != 0)
			remPart = a % b ;
			
		return remPart;
	}
	
	public static int displayDigits(int a) 
	{
		int intPart= 0;
		
		intPart = remainderPart(a,5); 
		remainderPart(a,5);
		
		return intPart;
	}
	
	
}
