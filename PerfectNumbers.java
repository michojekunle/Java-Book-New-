package ChapterSixExercises;

import java.util.Scanner;
public class PerfectNumbers 
{
	public static void main(String[] args) 
	{
		int i, Number,Minimum, Maximum, Sum = 0;
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Please enter the Minimum value: ");
		Minimum = sca.nextInt();
		
		System.out.println("Please enter the Maximum value: ");
		Maximum = sca.nextInt();
		
		for (Number = Minimum ;Number <= Maximum ; Number++)
		{
			for (i = 1, Sum = 0 ; i < Number; i++)
			{
				if (Number % i == 0 )
					{
					Sum = Sum + i;	
					}
			}
			if (Sum == Number)
			{
				System.out.printf("%d \t", Number);
			}
		}
	}
}
