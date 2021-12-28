package ChapterFiveExercises;
//EXercise 5.13 Factorials

public class Factorials
{
	public static void main(String[] args)
	{	
		int factorial = 1;
		int num; 
		
		for (int count = 1; count <= 200;count++)
		{
			for (num = count;num != 0;num--)
			{
				factorial *= num;
			}
			
			System.out.println("The Factorial of "+count+" = "+factorial);
			factorial = 1;
		}
	}
}