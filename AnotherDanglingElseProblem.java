package ChapterFourExercises;

public class AnotherDanglingElseProblem 
{
	public static void main(String[] args) 
	{
		int x, y;
		/**
		 * model code
		 * 	if (y == 8)
			if (x == 5)
			System.out.println("@@@@@");
			else
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		**/
		
		// a

		System.out.println("a\n");	
		x = 5;
		y = 8;
		
		if (y == 8)
		{
			if (x == 5)
			System.out.println("@@@@@");
		}
		else
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
			
		//b

			System.out.println("\nb\n");	
		x = 5;
		y = 8;
			
		if (y == 8)
		{
			if (x == 5)
			System.out.println("@@@@@");
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}

		//c
		System.out.println("\nc\n");	
		x = 5;
		y = 8;
			
			if (y == 8)
			{
				if (x == 5)
				System.out.println("@@@@@");
			}
			else
			{
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}
		
		//d
			System.out.println("\nd\n");	
		x = 5;
		y = 7;
			
		if (y == 8)
		{
			if (x == 5)
			System.out.println("@@@@@");
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
		
	}
}