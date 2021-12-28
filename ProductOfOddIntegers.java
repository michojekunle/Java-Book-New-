package ChapterFiveExercises;
//Exercise 5.12 product of odd integers

public class ProductOfOddIntegers 
{
	public static void main(String[] args) 
	{
		int oddNum = 1;
		int x = 1;
		
		for (int counter = 1;counter <= 8; counter++)
		{
			x = x * oddNum; 
			oddNum += 2;
		}
		
		System.out.println("THe Product of All odd integers within 1 and 15 is : "+x);
	}
}