package ChapterSixExercises;
import java.util.Scanner;

public class DistanceBetweenPoints 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		System.out.println("Enter coordinates of the first point (x1 y1)");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		
		System.out.println("Enter coordinates of the second point (x2 y2)");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		System.out.println("The Distance between the two point entered is: " + distance(x1, y1, x2, y2));
	}
	
	public static double distance(double x1, double y1, double x2, double y2)
	{
		double distance;
		distance = Math.sqrt(((y2 -y1) * (y2 -y1) + (x2-x1) * (x2-x1)));
		return distance ;
	}
}
