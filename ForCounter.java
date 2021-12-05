package ChapterFive;
//counter controlled repetition for the repetition statement  
public class ForCounter 
{
	public static void main(String[] args) 
	{
	// for statement header includes initialization,
	// loop continuation condition and increment 
	for (int counter = 1; counter <= 10; ++counter  )
		System.out.printf("%d  ", counter );
	
	int counter = 11;
	
	if (counter > 10 )
		System.out.println("The counter is more than expected");
	else 
		System.out.println();
	}
} // end class ForCounter
