package ChapterFourExercises;
//Exercise 4.37 Factorial
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to get its factorial: ");
		double num = sc.nextInt();
		
		System.out.println("Number = "+num+"\nFactorial = "+factorial(num));
		
		System.out.println("Enter the number of terms for the calculation e: ");
		double boy = sc.nextDouble();
		
		System.out.println("For the number of terms entered \ne = "+e(boy));
		
		
		System.out.println("Enter the number of terms for the calculation e^x: ");
		double girl = sc.nextDouble();
		
		System.out.println("For the number of terms entered \ne^x = "+ex(girl));
		
	}
	
	public static double factorial(double num)
	{
		double factorial = 1;
		if (num > 0) 
		{
				while (num != 0)
				{
					factorial = factorial * num;
					num--;
				}
		}
		return factorial;
	}
	
	public static double e(double boy)
	{
		double e = 1, count = 1 ;
		
		while (count <= boy)
		{
			e =  e + 1/factorial(count); 
			
			count++;
		}
		
		return e ;
	}
	

	public static double ex(double girl)
	{
		double e = 1, count = 1 ;
		
		while (count <= girl)
		{
			e =  e + Math.pow(4, count)/factorial(count); 
			
			count++;
		}
		
		return e ;
	}
	
}
