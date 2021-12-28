package ChapterFourExercises;
// Exercise 4.21 Find the largest number.
import java.util.Scanner;

public class FindTheLargestNumber 
{
	public static void main(String[] args) 
	{
		int counter = 1,
				number = 0,
				largest;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter ten integers to determine your largest.%n%n");
		
		
		largest = number;
		
		while (counter <= 10)
		{
			System.out.println("Enter integer "+counter+": ");
			number = sc.nextInt();
				
			if(number > largest)
				largest = number;
			
			counter++;
		}
		
		System.out.println("The largest number here is: "+largest);
	}
}
