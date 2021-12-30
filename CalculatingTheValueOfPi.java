package ChapterFiveExercises;

public class CalculatingTheValueOfPi 
{
	public static void main(String[] args) 
	{
		double pi = 0;
		int count;
		double term;
		System.out.printf("%10s%20s%n", "counter", "Value Of Pi");
		
		for (count = 1; count <= 200000; count++)
		{
			if (count % 2 == 0)
			{
				term = (double) -4/(2*count - 1);
			}
			else 
				term = (double) 4/(2*count - 1);
			pi += term;
			System.out.printf("%8d%20.5f%n", count, pi);
		}
	}
}
