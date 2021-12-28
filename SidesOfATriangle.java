package ChapterFourExercises;
// Exercise 4.35 Sides of a triangle.
import java.util.Scanner;

public class SidesOfATriangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the three non-zero digits representing sides of a triangle: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if (x+y>z)
			System.out.println("THe numbers entered represents the three sides of a triangle.");
		else
			if (x+z>y)
			System.out.println("THe numbers entered represents the three sides of a triangle.");
			else
				if (x+z>y)
				System.out.println("THe numbers entered represents the three sides of a triangle.");
				else
					System.out.println("THe numbers entered do not represent the three sides of a triangle.");
	}
}