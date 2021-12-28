package ChapterFourExercises;
//Exercise 4.33 Multiples of two with an infinite loop.

public class MultiplesOfTwoInfiniteLoop 
{
	public static void main(String[] args) 
	{
		int number = 2;
		
		while(number > 0)
		{
			System.out.println(number);
			number *= 2;
		}
	}
}
