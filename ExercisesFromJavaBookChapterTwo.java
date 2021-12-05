package ChapterTwoExercises;

import java.util.Scanner;

public class ExercisesFromJavaBookChapterTwo {
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Taking user input 

			Scanner userInput = new Scanner(System.in);
				int firstNumber;
				int secondNumber;
				int thirdNumber;
				int sum;
				int products;
				double average;
				
				System.out.print("Enter first number: ");
				firstNumber = userInput.nextInt();

				System.out.print("Enter second number: ");
				secondNumber = userInput.nextInt();

				System.out.print("Enter third number: ");
				thirdNumber = userInput.nextInt();

				sum = firstNumber + secondNumber + thirdNumber;

				products = firstNumber * secondNumber * thirdNumber;

				average = sum / 3;

				System.out.println("Sum is: " + sum);
				System.out.println("Products is: " + products );
				System.out.println("Average is: " + average);
				
				
			System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
			System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
			System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
			System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
			System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
			System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
			System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
			System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
			System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
			System.out.printf("The character %c has the value %d%n", '3', ((int) '3'));
			System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
			System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
			System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
			System.out.printf("The character %c has the value %d%n", 'B', ((int) 'b'));


				
			int     cons = 0,
					rem1 = 15 % 2,
					rem11 = 16 % 2,
					rem3 = 17 % 2,
					rem4 = 18 % 2;
			if (rem1 == cons)
				System.out.println("15 is an even number ");
			
			if (rem1 != cons)
				System.out.println("15 is an odd number ");
			
			if (rem11 == cons)
				System.out.println("16 is an even number ");
			
			if (rem11 != cons)
				System.out.println("16 is an odd number ");

			if (rem3 == cons)
				System.out.println("17 is an even number ");
			
			if (rem3 != cons)
				System.out.println("17 is an odd number ");

			if (rem4 == cons)
				System.out.println("18 is an even number ");
			
			if (rem11 != cons)
				System.out.println("18 is an odd number ");
			//exercise 2.26(multiple)
			//writing an application to check if a number is a multiple of another 
			
			int No = 17,
				No1 = 34,
				No2 = 0,
				A = 34 % 17; 
			 
			System.out.println("Numeber One = 17");
			System.out.println("Numeber Two = 34");
			
			if (A == No2)
				System.out.println("Number Two(34) is a Multiple of Number One(17)");	
			
			// Application  to print checkerboard pattern of asterisks
			        printCheckerBoard(3,4);
			        printCheckerBoard(8,8);
			        printCheckerBoard(5,6);
			        printCheckerBoard(8,16);
		//Diameter, Circumference and Area of a Circle
			        Scanner userInputTwo = new Scanner(System.in);
			        int radius;
			        System.out.println("Enter the radius of the Circle: ");
			        radius = userInputTwo.nextInt();
			        
			        System.out.println("Diameter of the circle = " + (2 * radius));
			        System.out.println("circumference of the cicle = " + 2 * Math.PI * radius);
			        System.out.println("area of the circle = " + Math.PI * radius * radius);
			        
	   // Separating the digits in an integer  
			        Scanner userInputThree = new Scanner(System.in);
			        
			        int digit1,
			        digit2,
			        digit3,
			        digit4,
			        digit5;
			        
			        System.out.println("Enter your five digits: "); 
			        digit1 = userInputThree.nextInt();
			        digit2 = userInputThree.nextInt();
			        digit3 = userInputThree.nextInt();
			        digit4 = userInputThree.nextInt();
			        digit5 = userInputThree.nextInt();
			      
			        System.out.println();
			        
			        System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5   );
			        int zero = 0,
			            	one = 1,
			    		   	two = 2,
			    		   	three = 3, 
			    		   	four = 4,
			    		   	five = 5, 
			    		   	six = 6, 
			    		   	seven = 7,
			    		   	eight = 8, 
			    		   	nine = 9,
			    		   	ten = 10;
			    		 System.out.println("number\t" + "square\t" + " cube\t" );    
			    		 System.out.println(zero + "\t"   + zero * zero  + "\t " + zero * zero * zero + "\t " );
			    		 System.out.println(one + "\t"   + one * one  + "\t " + one * one * one + "\t " );
			    		 System.out.println(two + "\t"   + two * two  + "\t " + two * two * two + "\t " );
			    		 System.out.println(three + "\t"   + three * three  + "\t " + three * three * three + "\t " );
			    		 System.out.println(four + "\t"   + four * four  + "\t " + four * four * four + "\t " );
			    		 System.out.println(five + "\t"   + five * five  + "\t " + five * five * five + "\t " );
			    		 System.out.println(six + "\t"   + six * six  + "\t " + six * six * six + "\t " );
			    		 System.out.println(seven + "\t"   + seven * seven  + "\t " + seven * seven * seven + "\t " );
			    		 System.out.println(eight + "\t"   + eight * eight  + "\t " + eight * eight * eight + "\t " );
			    		 System.out.println(nine + "\t"   + nine * nine  + "\t " + nine * nine * nine + "\t " );
			    		 System.out.println(ten + "\t"   + ten * ten  + "\t " + ten * ten * ten + "\t " );
		}
			    		 
			    public static void printCheckerBoard(int rows, int cols)
			    {
			        System.out.println("Rows: " + rows+" and Columns: " + cols);
			        for(int i=1;i<=rows;i++)
			        {
			            System.out.print("\t");
			            
			            for(int j=1;j<=cols;j++)
			                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
			                    System.out.print("*");
			                else
			                    System.out.print(" ");
			            System.out.println();
			        }
			        System.out.println("----------------------------");

	}
}
