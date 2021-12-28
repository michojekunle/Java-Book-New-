package ChapterFourExercises;
// Exercise 4.24 ValidatingUser Input.
import java.util.Scanner;

public class ValidateUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one(1) or two (2)");
		int input = sc.nextInt();
		
		while(!(input > 0 && input<= 2)) 
		{
			System.out.println("Wrong Input Enter one(1) or Two(2) ");
			input = sc.nextInt();
		}
		
		if (input == 1 || input == 2)
			System.out.println("Correct Input");
		 
			
	}
}
