package ChapterFiveExercises;
// Exercise 5.26 An Alternative to Break statement

public class BreakALternative 
{
	public static void main(String[] args) 
	{
		int factorial = 1;
		int num; 
		int count;
		
		for (count = 1; count <= 200 && count != 100;count++)
		{
			for (num = count;num != 0;num--)
			{
				factorial *= num;
			}
		
			System.out.println("The Factorial of "+count+" = "+factorial);
			factorial = 1;
		}
		System.out.printf("Broke out of the loop at %d", count);
	}
}
