package ChapterThreeExercises;
// Exercise 3.14   DateTest to test date class capabilities
public class DateTest 
{
	public static void main(String[] args)
	{
		Date myDateOfBirth = new Date(13, 06, 2021);
		
		System.out.print("My date of birth is: ");
		myDateOfBirth.displayDate();
	}
}
