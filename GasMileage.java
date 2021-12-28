package ChapterFourExercises;
//Exercise 4.17 GasMileage class
import java.util.Scanner;
/** Step down top wise refinement for Gas Mileage Class
 * Analyze the miles driven per gallon for a car and print the average
 * 
 * **/

public class GasMileage 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int count = 0;
		double total = 0;
		
		System.out.println("Enter -1 to exit or 1 to continue: ");
		int input = s.nextInt();
		
		while(input != -1)
		{
			count++;
			System.out.println("Enter the Miles driven: ");
			int mDriven = s.nextInt();
			
			System.out.println("Enter the Gallons Used: ");
			int gallon = s.nextInt();
			
			double averageMPG = (double) mDriven / gallon ; 
			System.out.println("Average miles per gallon for journey "+count+" is "+averageMPG);
			total += averageMPG;
						
			//prompt for continue or exit
			System.out.println("Enter -1 to exit or 1 to continue: ");
			input = s.nextInt();
		}
		
		double averageMPGTot = total / count;
		
		System.out.println("Total Average miles per gallon for all "+count+" journey(s) is "+averageMPGTot);
				
	}
}