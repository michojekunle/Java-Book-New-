package ChapterThreeExercises;
import java.util.Scanner;
public class HealthProfileTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Your gender Male or Female: ");
		String gender = sc.nextLine();
		
		System.out.println("Enter your day of birth: ");
		int day = sc.nextInt();
		
		System.out.println("Enter your month of birth: ");
		int month = sc.nextInt();
		
		System.out.println("Enter your year of birth: ");
		int year = sc.nextInt();
		
		System.out.println("Enter your height in inches: ");
		double height = sc.nextDouble();
		
		System.out.println("Enter your weight in pounds: ");
		double weight = sc.nextDouble();
		
		
		HealthProfile hPOne = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);
		
		System.out.println("You are "+hPOne.calYear(year)+ " years old.");
		hPOne.calcBMI();
		System.out.printf("Your maximum heart rate is %d.%n", hPOne.maxHrtRt(year));
		hPOne.targetHrtRt(year);
		hPOne.displayBMIValues();
	}
}