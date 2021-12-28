package ChapterFourExercises;
//Exercise 4.36 Sides of a right angled triangle
import java.util.Scanner;

public class SidesOfARightAngledTriangle 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the three non-zero digits representing sides \nof a triangle to determine whether it is a right angled triangle or not: ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if (x+y>z)
			System.out.println("The numbers entered represents the three sides of a triangle.");
		else
			if (x+z>y)
			System.out.println("The numbers entered represents the three sides of a triangle.");
			else
				if (x+z>y)
				System.out.println("The numbers entered represents the three sides of a triangle.");
				else
					System.out.println("The numbers entered do not represent the three sides of a triangle.");
		
		if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))
			System.out.println("The numbers entered represents the three sides of a Right Angled triangle.");
		else
			if (Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2))
				System.out.println("The numbers entered represents the three sides of a Right Angled triangle.");
			else
				if (Math.pow(z, 2) + Math.pow(y, 2) == Math.pow(x, 2))
					System.out.println("The numbers entered represents the three sides of a Right Angled triangle.");
				else
					System.out.println("The numbers entered do not represent the three sides of a Right Angled triangle.");
	}
}
