package ChapterFive;

public class WhileCounter 
{
	public static void main(String[] args) 
	{
		int counter = 1; //declare and initialize control variable
		
		while(counter <= 10) // loop-continuation condition 
		{
			System.out.printf("%d    ", counter);
			++counter; //increment control variable
		}
		
		System.out.println();
	
		int counterTwo = 0; //declare and initialize control variable
		
		while(++counterTwo <= 10) // loop-continuation condition 
		{
			System.out.printf("%d    ", counterTwo);
		}
		
		System.out.println();
	}
} //end class WhileCOunter 
