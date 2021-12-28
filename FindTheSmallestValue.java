package ChapterFiveExercises;
//Exercise 5.11 Find the smallest value
import java.util.Scanner;

public class FindTheSmallestValue 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int smallest= 100000000;
		
		int number,num;
		System.out.println("Enter the number of integers to enter: ");
		number = s.nextInt();
			
		for (int count = 1; count <= number;count++)
		{
			System.out.println("Enter number: ");
			num = s.nextInt();
			
			if (num < smallest)
				smallest = num;
		}
		System.out.println("Smallest Integer Entered is: "+smallest);
	}
}