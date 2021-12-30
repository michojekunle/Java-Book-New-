package ChapterFiveExercises;
// Exercise 5.32 Tax Plan Alternatives
import java.util.Scanner;
public class TheFairTax 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);	
		
		System.out.printf("Welcome to Fair Tax. %n%n");
		
		int count; 
		double fairTax = 0, tax;
		for (count = 1; count <= 7; count++)
		{
			if (count == 1)
			{
				System.out.println("Enter the amount you spent on housing this month");
				int housing = s.nextInt();
				tax = 0.23 * housing ;
				fairTax += tax;
			}
			if (count == 2)
			{
				System.out.println("Enter the amount you spent on food this month");
				int food = s.nextInt();
				tax = 0.23 * food ;
				fairTax += tax;
			}
			if (count == 3) 
			{
				System.out.println("Enter the amount you spent on clothing this month");
				int clothing = s.nextInt();
				tax = 0.23 * clothing ;
				fairTax += tax;			
			}
			if (count == 4) 
			{
				System.out.println("Enter the amount you spent on education this month");
				int edu = s.nextInt();
				tax = 0.23 * edu ;
				fairTax += tax;
			}
			if (count == 5)
			{
				System.out.println("Enter the amount you spent on HealthCare this month");
				int health = s.nextInt();
				tax = 0.23 * health ;
				fairTax += tax;
			}
			if (count == 6)
			{
				System.out.println("Enter the amount you spent on  transportation this month");
				int trans = s.nextInt();
				tax = 0.23 * trans ;
				fairTax += tax;
			}
			if (count == 7)
			{
				System.out.println("Enter the amount you spent on vacations this month");
				int vac = s.nextInt();
				tax = 0.23 * vac ;
				fairTax += tax;
			}	
			
		}
		System.out.println("Your Monthly Fair Tax is $"+fairTax);
	}
}
