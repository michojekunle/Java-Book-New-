package ChapterFive;
//compound interest calculations
public class Interest 
{

	public static void main(String[] args) 
	{
		double amount ;//amount to deposit at each end of the year 
		double principal = 1000.0; //initial amount before interest
		double rate = 0.05; // interest rate 
		
		//display headers 
		System.out.printf("%s%20s%n", "Year" , "Amount on deposit");
		
		//calculate amount on deposit at the end of each year of ten years 
		for (int year = 1; year <= 10; year++)
		{
			//calculate new amount for specified year
			amount = principal * Math.pow(1.0 + rate, year);
			
			//display the year and amount 
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}//end class interest 