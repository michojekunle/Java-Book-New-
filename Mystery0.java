package ChapterFourExercises;
// Exercise 4.16 Mystery0.java
public class Mystery0
{
	public static void main(String[] args)
	{
		int x = 1; 
		int total = 0; 
		
		while (x <= 10) 
		{
		int y = x * x;
		System.out.println(y);
		total += y;
		++x;
	} 
	
	System.out.printf("Total is %d%n", total);
	}
} // end class Mystery