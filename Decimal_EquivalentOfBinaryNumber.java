package ChapterFourExercises;
//Exercise 4.31 printing decimal equivalent of a binary number.
import java.util.Scanner;

public class Decimal_EquivalentOfBinaryNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a binary number containing 0 and 1: ");
		int binNum = scan.nextInt();
		
		System.out.println("The binary number is: "+binNum+"\nThe Decimal equivalent is: "+getDecimal(binNum));
	} 
	
	public static int getDecimal(int bin)
	{
		int decimal = 0, rem, count = 0;
		while(bin != 0)
		{
			rem = bin % 2;
			decimal = decimal + rem * (int) Math.pow(2, count);
			bin = bin / 10;
			count++;
		}
		
		return decimal;
	}
}
