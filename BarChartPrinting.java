package ChapterFiveExercises;
//Exercise 5.16 Bar Chart printing program
import java.util.Scanner;

public class BarChartPrinting 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter five numbers");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.print(x+": ");
		for (int count = 1;count<=x;count++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print(y+": ");
		for (int count = 1;count<=y;count++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print(z+": ");
		for (int count = 1;count<=z;count++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print(a+": ");
		for (int count = 1;count<=a;count++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print(b+": ");
		for (int count = 1;count<=b;count++)
		{
			System.out.print("*");
		}
	}
}