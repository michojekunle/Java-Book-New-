package ChapterTwo;

	// Compare integers using if statements, relational operators 
		 // and equality operators.
		 
		 public class Comparison { 
			 // main method begins execution of Java application

			 public static void main(String[] args){
		 
		 int number1 = 2000; // first number to compare
		 int number2 = 1356; // second number to compare
		
		 System.out.print("Enter first integer: 2876\n "); // prompt 
 
		
		 System.out.print("Enter second integer: 5567\n"); // prompt 
		 
		 
		if (number1 == number2) 
		 System.out.printf("%d == %d%n", number1, number2);
		
		if (number1 != number2) 
		 System.out.printf("%d != %d%n", number1, number2);
		
		if (number1 < number2) 
		 System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2) 
			 System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2) 
			 System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2) 
			 System.out.printf("%d >= %d%n", number1, number2);
	
	}//end method main	

} //end class Comparison
