package ChapterSixExercises;
// Java Application which obtains user input for its radius and prints its volume
import java.util.Scanner;

public class SphereVolumeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner enterRadius = new Scanner(System.in);
		
		// prompt the user to enter the radius of the sphere
		System.out.println("Enter the radius of the sphere to get its volume: ");
		double radius = enterRadius.nextDouble();
		
		System.out.printf("The volume of the sphere of radius %.2f is "
				+ "%.2f", radius, sphereVolume(radius));
	}
		
		// create a method sphereVolume to calculate 
		// and return the volume of a sphere
		public static double sphereVolume(double radius)
		{
			double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);	
			return volume;
		}
}