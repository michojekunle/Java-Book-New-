package ChapterFourExercises;
// Exercise 4.18 CreditLimitCalculator.
import java.util.Scanner;

public class CreditLimitCalculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int accountNumber;
		int bbalance;
		int totItemsCharged;
		int totCreditsApplied;
		int creditLimit;
		
		System.out.println("Enter your account number: ");
		accountNumber = scan.nextInt();
		
		System.out.println("Enter your balance at the beginning of the month: ");
		bbalance = scan.nextInt();
		
		System.out.println("Enter total of all items charged by customer this month: ");
		totItemsCharged = scan.nextInt();
		
		System.out.println("Enter the total of all credits applied to the customer's account this month: ");
		totCreditsApplied = scan.nextInt();
		
		System.out.println("Enter your allowed credit limit: ");
		creditLimit = scan.nextInt();
		
		int newBalance = bbalance + totItemsCharged - creditLimit; 
		
		System.out.println("Your new balance is: "+newBalance);
		
		if (newBalance > creditLimit)
			System.out.println("Credit limit exceeded.");
	}
}
