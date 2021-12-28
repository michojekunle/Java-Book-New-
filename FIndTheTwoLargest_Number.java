package ChapterFourExercises;

import java.util.Scanner;

public class FIndTheTwoLargest_Number 
{
	public static void main(String[] args) 
	{
		int counter = 1,
				number = 0,
				largest,
				secondLargest = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter ten integers to determine your largest.%n%n");
		
		
		largest = number;
		
		while (counter <= 10)
		{
			System.out.println("Enter integer "+counter+": ");
			number = sc.nextInt();
				
			if(number > largest)
				largest = number;
			
			while (number < largest) 
			{
				if(number > secondLargest)
					secondLargest = number;
			}
			counter++;
		}
		
		System.out.println("The largest number here is: "+largest);
		System.out.println("The  Second largest number here is: "+secondLargest);
	}
}
