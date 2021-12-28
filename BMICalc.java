package ChapterTwoExercises;
//Exercise 2.33 BMI calculator
import java.util.Scanner;
public class BMICalc 
{
	public static void main(String[] args) 
	{
		Scanner sd = new Scanner(System.in);
		double height, weight, BMI;
		
		System.out.println("Enter your height in inches: ");
		height = sd.nextDouble();
		
		System.out.println("Enter your weight in pounds: ");
		weight = sd.nextDouble();
		
		BMI = (weight * 703) / (height * height) ;
		
		System.out.printf("Your BMI(Body Mass Index) is: %.1f%n", BMI);
		
		if (BMI<18.5)
			System.out.println("You are Underweight.");
		else 
			if (BMI >= 18.5 && BMI <= 24.9)
				System.out.println("You are normal.");
			else 
				if (BMI >= 25 && BMI <= 29.9)
					System.out.println("You are Overweight.");
				else 
					if (BMI >= 30)
						System.out.println("You are Obese.");
		
		System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 25.9\n"
				+ "Overweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater.");
		
	}
}
