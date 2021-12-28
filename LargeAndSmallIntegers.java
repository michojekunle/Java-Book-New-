package ChapterTwoExercises;
// Exercise 2.24 Largest and Smallest Integers 
import java.util.Scanner;

public class LargeAndSmallIntegers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e;
		
		System.out.println("Enter five Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		int large = a;
		
		if (b > large)
			large = b;
		if (c > large)
			large = c;
		if (d > large)
			large = d;
		if (e > large)
			large = e;
		
			
		int small = a;
		
		if (b < small)
			small = b;
		if (c < small)
			small = c;
		if (d < small)
			small = d;
		if (e < small)
			small = e;

		System.out.println("The Smallest Number of these Numbers is: "+ small);
		System.out.println("The Largest Number of these Numbers is: "+ large);
	}
}
 