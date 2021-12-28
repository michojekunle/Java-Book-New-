package ChapterTwoExercises;
// Exercise 2.35 Car Pool Savings
import java.util.Scanner;

public class CarPoolSavingsCalc 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int averageMPG;
		int milesD, CPG, parkFees, TPD, dailyDrivingC;
		
		System.out.println("Enter the Total miles Driven per day: ");
		milesD = sc.nextInt();
		
		System.out.println("Enter the cost Per Gallon of gasoline: ");
		CPG = sc.nextInt();
		
		System.out.println("Enter the AVerage miles per gallon : ");
		averageMPG = sc.nextInt();
		
		System.out.println("Enter your parking fees for last week: ");
		parkFees = sc.nextInt();
		
		System.out.println("Enter tolls per day: ");
		TPD = sc.nextInt();
		
		dailyDrivingC = ((milesD / averageMPG) * CPG) + parkFees + TPD;
		
		System.out.println("Your Daily Driving Cost is: $ "+ dailyDrivingC);     
	}
}
