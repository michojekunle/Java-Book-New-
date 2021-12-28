package ChapterFourExercises;
// Exercise 4.19 Sales commission calculator
import java.util.Scanner;

public class SalesCommisionCalculator 
{
	public static void main(String[] args) 
	{
		double salesPay = 200;
		double item1 = 239.99;
		double item2 = 129.75;
		double item3 = 99.95;
		double item4 = 350.89;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items one sold out: ");
		int numit1 = sc.nextInt();
		
		System.out.println("Enter the number of items two sold out: ");
		int numit2 = sc.nextInt();
		
		System.out.println("Enter the number of items three sold out: ");
		int numit3 = sc.nextInt();
		
		System.out.println("Enter the number of items four sold out: ");
		int numit4 = sc.nextInt();
		
		double sales = (numit1 * item1) + (numit2 * item2) + (numit3 * item3) + (numit4 * item4);
		double commission = 0.09 * sales;
		
		double salesCommission = salesPay + commission;
		System.out.println("Your pay is $"+salesCommission);
		
	}
}
