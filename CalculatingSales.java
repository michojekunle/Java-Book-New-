package ChapterFiveExercises;
// Exercise 5.16 Calculating Sales
import java.util.Scanner;

public class CalculatingSales 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double productS = 0;
		int quantity;
		double sales = 0;
		System.out.println("Welcome to Calculating Sales Program\n"
				+ "Enter the number of product i.e. Product 1 then enter the quantity sold\nOR enter 0 to quit ");
		int inp = scan.nextInt();
		
		while (inp != 0)
		{
			System.out.println("Enter the product number: Product ");
			productS = scan.nextInt();
			
			System.out.println("Quantity: ");
			quantity = scan.nextInt();
			
			sales = sales + productS * quantity; 
		}
		
		
		
		switch (productS)
		{
			case 1:
				productS = 2.98;
		}
		
	}
}
