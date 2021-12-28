package ChapterFourExercises;
//Exercise 4.20  Salary Calculator
import java.util.Scanner;

public class SalaryCalaculator 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int numEmployees;
		double hoursWorked;
		int numStandardHours = 40;
		
		double hourlyRates;
		double salary;
		
		System.out.println("Enter the number of Employees");
		numEmployees = s.nextInt();
		
		System.out.println("Enter the Amount per hour for last week.");
		hourlyRates = s.nextInt();
		
		int count = 1;
		while (count <= numEmployees)
		{
			
			System.out.println("Enter the number of hours worked for employee "+count+" last week: ");
			hoursWorked = s.nextDouble();
			
			double additionalHour = hoursWorked - numStandardHours;
			
			if (hoursWorked > 40)
				salary = (additionalHour * hourlyRates/2) + numStandardHours*hourlyRates; 
			else
				salary = hoursWorked * hourlyRates;
			
			System.out.println("Employee "+count+" your salary is: $"+salary);
			
			count++;
		}
				
				
	}
}
