package ChapterSixExercises;

import java.util.Scanner;
public class TableOfNumberSystems 
{
	
	public static int binary(int decimalNum)
	{
		int binNum[] = new int[100];
		int index = 0;
		while (decimalNum > 0)
		{
			
			 binNum[index++] = decimalNum % 2;			 
			 decimalNum = decimalNum/2;
		}
		
		for(int i = index-1;i >= 0; i--)
		{
			System.out.print(binNum[i]);
		}
		System.out.println();
		return index;
	}
	
	public static void main(String[] args) 
	{
		int x;
		for (x=1;x<=256;x++) 
		{
			System.out.println();
			
			System.out.print("Binary of "+ x +" is: ");
			binary(x);
			
			System.out.println("Octal system of "+ x +" is: " + octal(x));
			;
			
			System.out.println("Hexadecimal system of "+ x +" is: " + toHex(x));
			
		}
	}
	
	
	public static String octal(int decimalNum)
	{
		int rem;
		
		String oct = "";
		
		char octchars[] = {'0','1','2','3','4','5','6','7'};
		
		while (decimalNum > 0)
		{
			rem=decimalNum%8;
			oct=octchars[rem]+oct;
			decimalNum=decimalNum/8;
		}
		return oct;		
	}
	
	public static String toHex(int decimalNum)
	{
		
		int rem; 
		
		String hex = "";
	
		char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(decimalNum>0)
		{
			rem=decimalNum%16;
			hex=hexchars[rem]+hex;
			decimalNum=decimalNum/16;
			
		}
		return hex;
	}
}