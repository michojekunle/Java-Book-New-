package ChapterSixExercises;

import java.util.Scanner;
public class GreatestCommonDivisor 
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter two integers seperated by spaces: ");
	int x = scan.nextInt();
	int y = scan.nextInt();

	System.out.println("The Greatest Common Divisor of " + x + ", " + y + " is: " + gcd(x, y));
	
	}
	
	public static int gcd(int x, int y)
	{
		int gcd, cd = 0, count;
		
		for (count = 1; count<x || count <y;count++)
		{
			if (x%count == 0 && y%count == 0)
			{
				cd = count;
				System.out.println("Common Divisor is:" + cd);
			}
		}
		System.out.println();
		if (x % cd == 0 && y % cd == 0)
			gcd = cd;
		else 
			gcd = 0;
		
		return gcd;
	}
}
