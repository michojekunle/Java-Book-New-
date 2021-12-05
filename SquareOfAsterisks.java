package ChapterSixExercises;
// program printing square of of asterisks according to user's input
import java.util.Scanner;

public class SquareOfAsterisks 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of your square: ");
		int side = sc.nextInt();
		
		System.out.print(squareOfAsterisks(side));
		System.out.print("-sided square printed.");
		
	}
	
	public static int squareOfAsterisks(int s)
	{
		if (s != 0 )
		{
			System.out.println("Side is " + s + " and shape is below:\n ");
			
			for (int count = 1; count <= s * s; count++)
			{
				System.out.print("*");
				
				if (count % s*s == 0)
					System.out.println();
			}
		}
			System.out.println();
		int count = s;
		
		return count; 
	}
}
