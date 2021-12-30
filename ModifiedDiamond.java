package ChapterFiveExercises;
// Exercise 5.25 modified diamond printing
import java.util.Scanner;

public class ModifiedDiamond 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		int max = 0;
		int con = 0;
		int rows;
		
		System.out.println("Enter a number between 1 and 19: ");
		rows = keyboard.nextInt();
		
		for ( con = 0; con < rows; con++)
		{
			for (int j = rows; j > con ;j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < con;k++)
			{
				System.out.print("*");
			}
			if ((con >= 2) && (con <= rows))
			{
				for(int l = 0; l <= max; l++)
				{
					System.out.print("*");
				}
				if (max != rows)
					max++;
			}
			System.out.println();
		}
		for (con = rows;con > 0;con--)
		{
			for (int j = rows;j > con; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0 ;k < con;k++)
			{
				System.out.print("*");
			}
			if ((con >= 2) && (con <= rows))
			{
				for (int l = 0; l <= max;l++)
				{
					System.out.print("*");
				}
				if (max != 0)
					max--;
			}
			System.out.println();
		}

	}
}
