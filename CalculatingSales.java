package ChapterFiveExercises;
// Exercise 5.16 Calculating Sales
import java.util.Scanner;

public class CalculatingSales 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int productS = 0;
		int quantity;
		double sales = 0;
		double product1 ;
		double product2 ;
		double product3 ;
		double product4 ;
		double product5 ;
		
		System.out.println("Welcome to Calculating Sales Program\n"
				+ "Enter 1 to continue \nOR enter 0 to quit ");
		int inp = scan.nextInt();
		
		while (inp != 0)
		{
			System.out.println("Enter the product number 1 - 5: Product ");
			productS = scan.nextInt();
			
			System.out.println("Quantity: ");
			quantity = scan.nextInt();
			
			switch (productS)
			{
				case 1: 
					product1 = 2.98;
					sales += (2.98 * quantity);
				break;
				
				case 2: 
					product2 = 4.50;
					sales += (4.50*quantity);
				break;
				
				case 3: 
					product3 = 9.98;
					sales += (9.98 * quantity);
				break;
				
				case 4: 
					product4 = 4.49;
					sales += (4.49 * quantity);
				break;
				
				case 5: 
					product5 = 6.87;
					sales += (6.87 * quantity);
			}
		
			System.out.println("Enter 1 to continue or 0 to exit.");
			inp = scan.nextInt();
		
		}
		
		System.out.printf("Total Sales = $%.2f",sales);
	}
}
