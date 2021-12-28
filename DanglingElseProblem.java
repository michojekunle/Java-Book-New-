package ChapterFourExercises;

public class DanglingElseProblem 
{
	public static void main(String[] args) 
	{
		 int x = 11;
		 int y = 9;
		 
		 if (x < 10)
			 if (y > 10)
				 System.out.println("*****"); 
		 else
			System.out.println("#####");
		 	System.out.println("$$$$$");
		 
		 	if (x < 10) 
		 	{
		 		if (y > 10)
		 			System.out.println("*****"); 
		 	}
		 	else
		 	{
		 		System.out.println("#####");
		 		System.out.println("$$$$$");
		 	}

			System.out.println();
			 
			x = 9;
			y = 11;
			 
			 if (x < 10)
				 if (y > 10)
					 System.out.println("*****"); 
			 else
				System.out.println("#####");
			 	System.out.println("$$$$$");
			 
			 	if (x < 10) 
			 	{
			 		if (y > 10)
			 			System.out.println("*****"); 
			 	}
			 	else
			 	{
			 		System.out.println("#####");
			 		System.out.println("$$$$$");
			 	}
			 
	}
}// End class DanglingElseProblem
