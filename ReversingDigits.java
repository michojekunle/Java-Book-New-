package ChapterSixExercises;


import java.util.Scanner;
public class ReversingDigits 
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
			System.out.print(i);
			
			integer = integer / 10;
			}
			
		}
		else 
			System.out.println("Try Again later you've entered a wrong input. ");
	}
}
		



	
