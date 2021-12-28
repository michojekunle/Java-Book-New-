package ChapterFiveExercises;
//Exercise 5.15 Triangle printing program

public class TrianglePrinting 
{
	public static void main(String[] args) 
	{
		int x, y;
		// Triangle a
		for (int count = 1;count <= 10;count++)
		{
			for(x = 1;x <= count;x++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// Triangle b
		for (int count = 10;count != 0;count--)
		{
			for(x = 1;x <= count;x++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int coun = 10;
		//Triangle c 
		for (int count = 1;count <= 10;count++)
		{
			for(x = coun;x != 0;x--)
			{
				System.out.print("*");
			}			
			coun--;
			System.out.println();
			
			for (y = 1; y <= count;y++)
			{
				System.out.print(" ");
			}
		
		}
		
		System.out.println();
		
		coun = 10;
		//Triangle d 
		
		for (int count = 1;count <= 10;count++)
		{

			for (y = coun; y != 0;y--)
			{
				System.out.print(" ");
			}
			coun--;
			
			for(x = 1;x <= count ;x++)
			{
				System.out.print("*");
			}			
			
			System.out.println();
		}
		
	}
}
