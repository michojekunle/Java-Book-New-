package ChapterTwoExercises;
// Exercise 2.16 Comparing Integers
import java.util.Scanner;
public class CompInt 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter two NUmbers ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a > b)
			System.out.printf( a + " is larger than "+ b);
		else 
			if (b > a)
				System.out.printf( b + " is larger than "+ a);
			else 
				if (a == b)
					System.out.printf("These Numbers are equal.");
	}
}
