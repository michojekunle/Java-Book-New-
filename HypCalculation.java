package ChapterSixExercises;
// Calculation of 
import java.util.Scanner;
public class HypCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the number of triangles hypotenuses to be calculated: ");
		final int numTriangles = sca.nextInt();
	
		
		for (int counter = 1; counter<=numTriangles; counter++)
		{
			
			System.out.println("Enter first side for Triangle" +counter+": ");
			double side1 = sca.nextDouble();
			
			System.out.println("Enter second side for Triangle" +counter+ ": ");
			double side2 = sca.nextDouble();
		
			System.out.println("side1 = " + side1 + "\nside2 = " + side2 );
			System.out.print("Hypotenuse = " );
				
			System.out.println(hypotenuse(side1, side2));
			System.out.println();
		}
	}

	public static double hypotenuse(double side1, double side2)
	{
		double hypot = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
		return hypot; 
	}
}
