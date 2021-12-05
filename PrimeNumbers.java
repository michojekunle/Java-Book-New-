package ChapterSixExercises;

import java.util.Scanner;
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int x = scan.nextInt();
		
		System.out.println(forPrime(x));
	}
	
	public static int forPrime(int x)
	{
		int prime = 0;
		
			if(x== 0 || x==1) 
				System.out.println( "The number entered is not a prime number");
			else 
				if ( x%2 == 0 || x%3 == 0 ||
						x%4 == 0 || x%5 == 0 || x%6 == 0 ||  x%7 == 0 || x%8 == 0 || x%9 == 0)
					System.out.println( "The number entered is not a prime number");
				else 
					if (x%1 == 0 && x%x == 0 && x%2 != 0 && x%3 != 0 &&
							x%4 != 0 && x%5 != 0 && x%6 != 0 &&  x%7 != 0 && x%8 != 0 && x%9 != 0)
					{
						prime = x;
						System.out.println(prime +" is a prime number");
					}
		return prime;
	}
}
