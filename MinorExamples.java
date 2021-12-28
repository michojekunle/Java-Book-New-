package ChapterFiveExercises;
// Exercise 
public class MinorExamples 
{
	public static void main(String[] args) 
	{
		int value = 17;
		
		switch (value % 2) 
		{
		 	case 0:
		 		System.out.println("Even integer");
		 		break;
		 	case 1:
		 		System.out.println("Odd integer");
		}
		
		for (int i = 19; i >= 1; i -= 2)
			 System.out.println(i);
		
		int counter = 2;
		do
		{
			System.out.println(counter);
			counter += 2;
		} 
		while (counter <= 100);
		
	}
		
		 

} // end class Printing
