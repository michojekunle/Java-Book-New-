package ChapterSixExercises;

import java.util.Scanner;
public class FIndTheMinimum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three digits seperated by spaces: ");
		int dig1 = scan.nextInt();
		int dig2 = scan.nextInt();
		int dig3 = scan.nextInt();
		
		System.out.println("The minimum of the three digits " + dig1 +", " + dig2 + ", " +dig3 + 
			" is: " + minimum3(dig1, dig2, dig3));
	}
	
	public static float minimum3(float a, float b, float c)
	{
		return Math.min(a, Math.min(b, c));
	}
}
