package ChapterFiveExercises;
// Exercise 5.22
public class ModifiedTrianglePrintingProgram 
{
	public static void main(String[] args) 
	{
		int i, max = 0;
		for (i = 1; i < 10; i++)
		{
			for (int k = 0;k < i;k++)
			{
				System.out.print("*");
			}
			for (int j = 10; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int j = 10; j > i; j--)
			{
				System.out.print("*");
			}
			for (int k = 0;k < i;k++)
			{
				System.out.print(" ");
			}
			
			if ((i >= 2) && (i <= 9))
			{

				for (int l = 0;l <= max;l++)
				{
					System.out.print(" ");
				}
				if(max != 9)
					max++;
			}	

			for (int j = 10;j > i;j--)
			{
				System.out.print("*");
			}
			
			for (int j = 10;j > i;j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}