package ChapterTwoExercises;
//
import java.util.Scanner;
public class WPGRate 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);  
		
		double estPop,currentpop, growthR, t = 1; 
		
		System.out.println("Enter the current world population: ");
		currentpop = sc.nextDouble();
		
		System.out.println("Enter the current world population Growth rate: ");
		growthR = sc.nextDouble();
				
		estPop = currentpop * (Math.pow(growthR, t));
		
		System.out.printf("The estimated population for the given population %.0f after %.0f year is: %.3f%n", currentpop, t, estPop);
		
		estPop = currentpop * (Math.pow(growthR, 2));
		System.out.printf("The estimated population for the given population %.0f after 2 years is: %.3f%n", currentpop, estPop);
		
		estPop = currentpop * (Math.pow(growthR, 3));
		System.out.printf("The estimated population for the given population %.0f after 3 years is: %.3f%n", currentpop, estPop);
		
		estPop = currentpop * (Math.pow(growthR, 4));
		System.out.printf("The estimated population for the given population %.0f after 4 years is: %.3f%n", currentpop, estPop);
		
		estPop = currentpop * (Math.pow(growthR, 5));
		System.out.printf("The estimated population for the given population %.0f after 5 years is: %.3f", currentpop, estPop);
		
	}
}
