package ChapterFourExercises;
// Exercise 4.30 Palindrome 
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num, rem, tem, temp = 0;
		System.out.println("Enter a five digit number: ");
		num = sc.nextInt();
		
		tem = num;
		
		while (num < 10000 || num >99999)
		{
			System.out.println("Wrong input Enter a five digit number: ");
			num = sc.nextInt();
		}
		
		if (num >= 10000 || num <=99999)
		{
			while (tem != 0)
			{ 			 
				rem = tem % 10;
				temp = temp * 10 + rem;
				tem /= 10;
			}
		}
		
		if (num == temp)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is not a palindrome");
	}
}