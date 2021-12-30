package ChapterFiveExercises;
//Exercise 5.24 Diamond printing program
public class Diamond 
{
	public static void main(String[] args) 
	{
		int max = 0;
		int con = 0;
		for ( con = 0; con < 9; con++)
		{
			for (int j = 9; j > con ;j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < con;k++)
			{
				System.out.print("*");
			}
			if ((con >= 2) && (con <= 9))
			{
				for(int l = 0; l <= max; l++)
				{
					System.out.print("*");
				}
				if (max != 9)
					max++;
			}
			System.out.println();
		}
		for (con = 9;con > 0;con--)
		{
			for (int j = 9;j > con; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0 ;k < con;k++)
			{
				System.out.print("*");
			}
			if ((con >= 2) && (con <=9))
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