//Fig 2.7: Addtion.java
//Addition program that inputs two numbers then Displays their sum
package ChapterTwo;
 
	public class Addition {
	
		//main method begins execution of Java Application
	public static void main(String[] args) {
	
		
		int number1 = 57, //first number to add
		 	number2 = 76, //second number to add
		 	sum = number1 + number2; //sum of number1 and number2
	
		System.out.print("Enter first integer: 57\n"); //prompt
	
		System.out.print("Enter second integer: 76\n"); //prompt
		
		System.out.printf("Sum is %d%n", sum ); // display sum
		/// this is a comment that talks about another part called multiplication 
			double No1 = 35,
				   No2 = 25, 
				   product = No1 * No2;
			System.out.printf("Number1 (first number) = 35\n" );
			System.out.printf("Number1 (second number) = 25\n");
			System.out.printf("Product is %s%n ", product );//display product
		//trying to carry out a 
			char  firstV  = 'a',
				  secondV = 'b',
				  thirdV  = 'c',
				  fourthV = 'x' ;
			System.out.println("polynomial solvings: (a*x*x) + (b*x) + c \n"
					+ "(2 * 3 * 3) + (5 * 3) + 9");
			
		} //end method main  
		
} // end class Addition 
