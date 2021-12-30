package ChapterFiveExercises;
//Exercise 5.
public class PhythagoreanTriples 
{
	public static void main(String[] args) 
	{
		int side1, side2, hypotenuse;
		System.out.println("This is an example of brute force computing."
				+ "\nA Triple nested loop is used to find all possible "
				+ "pythagorean triples for the adjacent, \nopposite and "
				+ "hypotenuse sides of a right angled triangle. "
				+ "\nFor this example all sides must be no larger than 500.\n");
		
		// loop for all decimal numbers between 1 and 1000
		for(side1 = 1;side1 <= 500;side1++)
		{
			for(side2 = 1;side2 <= 500; side2++)
			{
				for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
				{
					if ((side1 * side1) + (side2* side2) == (hypotenuse * hypotenuse))
					{	System.out.println("side 1 = "+side1+"\tside 2 = "
								+ ""+side2+"\tHypotenuse = "+hypotenuse);
					}//end if statement
				}// end hypotenuse (3rd) for loop
			}// end side2 (2nd) for loop
		}// end side1 (3rd) for loop	
	}//end method main
}// end class PythagoreanTriples
