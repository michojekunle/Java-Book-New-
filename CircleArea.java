package ChapterSixExercises;
// Application that calculates the area of a circle through the radius 
// entered as input from the command window 
import java.util.Scanner;

public class CircleArea 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		// allow the user to enter the input the radius of the circle
		System.out.println("Enter the radius of your cicle: ");
		double radius = scan.nextDouble();
		
		System.out.print("The Area of your Circle = ");
		
		System.out.print(circleArea(radius));
			
	}
    public static double circleArea(double radius)
    {
    	double circleArea =  Math.PI * radius * radius;
    
    	return circleArea;
    }
}