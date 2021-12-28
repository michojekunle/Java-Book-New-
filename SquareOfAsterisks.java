package ChapterFourExercises;
///Exercise 4.29 printing a square of asterisks
import java.util.Scanner;

public class SquareOfAsterisks 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int s, count = 1;
		
		System.out.println("Enter the side: ");
		s = scan.nextInt();
		
		if(s <= 20)
		{
			
			while(count <= s*s)
			{
				System.out.print("*");	
				int mul = 1;
				while(mul<20)
				{
					if(count == mul*s)
						System.out.println();
					mul++;
				}
				count++;
			}
		}
		else
			System.out.println("Input Extended programme ability.");
	}
}