package ChapterSixExercises;

import java.util.Scanner;

public class SquareOfAnyCharacter 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of your square: ");
		int side = sc.nextInt();
		
		System.out.println("Enter the fillCharacter of your square: ");
		char fill = sc.next().charAt(0);
		
		System.out.print(squareOfCharacters(side, fill));
		System.out.print("-sided square printed.");
		
	}
	
	public static int squareOfCharacters(int s, char fillCharacter)
	{
		if (s != 0 )
		{
			System.out.println("Side is " + s + ", Character is "+ fillCharacter+ " and shape is below:\n ");
			
			for (int count = 1; count <= s * s; count++)
			{
				System.out.print(fillCharacter);
				
				if (count % s*s == 0)
					System.out.println();
			}
		}
			System.out.println();
		int count = s;
		
		return count; 
	}

}
