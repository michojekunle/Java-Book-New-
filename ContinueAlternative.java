package ChapterFiveExercises;
//Exercise  5.28 An Alternative for Continue 

public class ContinueAlternative 
{
	public static void main(String[] args) 
	{
		int amount ;//amount to deposit at each end of the year 
		int principal = 1000; //initial amount before interest
		int dollars = 0;
		int cents = 0;
			
		//display headers 
		System.out.printf("%7s%26s%n", "Year" , "Amount on deposit");
		
		//calculate amount on deposit at the end of each year of ten years 
		for(int rate = 5;rate<=10 ;rate++) 
		{
			if (rate == 7)
				rate += 1;
			System.out.println("At the rate of "+rate+"%: \n");
			for (int year = 1; year <= 10; year++)
			{
				//calculate new amount for specified year
				amount = principal * (100 + rate) / 100;
				principal = amount;
				
				//dollars and cents
				dollars = amount / 100;
				cents = amount % 100;
				
				//display the year and the amount 
				System.out.printf("%4d%,15d", year, dollars);
				
				// if decimal is not a two-digit figure
				//concatenate with a zero
				if (cents < 10)
					System.out.printf(".0%d\n", cents);
				else
					System.out.printf(".%d\n", cents);
			}
			principal = 1000;	
			System.out.println();
		}
	}
}
