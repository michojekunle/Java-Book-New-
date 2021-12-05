package ChapterSixExercises;
// application that calculates the parking charges for the time parked
//and prints the total receipts of charges for yesterday  
import java.util.Scanner;
 
public class ParkingCharges 
{
	public static void main(String[] args) 
	{
		Scanner inputHour = new Scanner(System.in);
		
		// Prompt user to enter the number of cars parked yesterday
		System.out.println("Enter the number of cars parked Yesterday: ");
		
		final int NUMBER_OF_CARS = inputHour.nextInt(); 
		    
			double hoursParked = 0;
		    double currentCost = 0;
		    double totalCost = 0;
		    
		// prompt the user to enter the number of hours each car parked yesterday
		
		for (int count = 1; count<= NUMBER_OF_CARS; count++)
		{   
			System.out.println("Enter the number of hours for car " + count + ": ");
			hoursParked = inputHour.nextDouble();
			currentCost = calculateCharges(hoursParked);
			
			System.out.println("The charge for car " + count + " is: $" + currentCost) ;
			totalCost += currentCost;
			System.out.println();			
		}
		System.out.println("The parking charge for the current customer is: "+ currentCost);
		
		System.out.println("The total Receipt for all of yesterday's charges is: $" + totalCost);
		
	}// end method main

	public static double calculateCharges(double hours)
	{
		double getCharges = 0;
		
		if (hours <= 3)
			getCharges = 2.0 ;
		
		else if (hours > 3 && hours <= 19 )
			getCharges = 2.0 + (0.5 * (hours - 3) );
		
		else if (hours > 19)
			getCharges = 10;
		
		return getCharges;	
	}// end method calculateCharges
}// end class ParkingCharges
