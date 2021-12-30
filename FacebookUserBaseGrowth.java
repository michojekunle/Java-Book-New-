package ChapterFiveExercises;
//Exercise 5.33
public class FacebookUserBaseGrowth 
{
	public static void main(String[] args) 
	{
		double facebookPopu = 1000000000,
				newFacebookPop, 
				rate = 0.04;
		
		for (int month = 1; month <= 48; month++)
		{
			//calculate new amount for specified year
			newFacebookPop = facebookPopu * Math.pow(1.0 + rate, month);
			
			//display the year and amount 
			System.out.printf("%2d %,20.0f%n", month, newFacebookPop);
		
		}
	}
}
