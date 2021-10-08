package JavaBookPack;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FirstGithubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Happy Coding
			float weight = 180.6F;	// narrow Casting
			short myShort = (short) weight ;
		System.out.println(weight);
		System.out.println(myShort);
//Java Video
		// Ternary operator
		
					int one = 15;
					String message = one >= 18 ? 
							"Hooray.... I am an Adult"	:
							"I am not an Adult ";
				System.out.println(message);
			
			//switch operator 
				String gender = "man";
				
				switch (gender.toUpperCase()) 	{
					case "FEMALE":
						System.out.println("I am a Female");
						break;
					case "MALE":
						System.out.println("I am a Male");
						break;
					case "PREFER_NOT_SAY":
						System.out.println("I Pefer Not To Say");
						break;
					default:
					System.out.println(" unknown gender ");
											}
				//Arrays 
			
				//integer
					int zero = 0,
						one1 = 1;
					int [] numbers = new int[12] ;
					numbers[0] = 1;
					numbers[1] = 2;
					numbers[2] = 3;
					numbers[3] = 4;
					numbers[4] = 6;
					numbers[5] = 7;
					numbers[6] = 8;
					numbers[7] = 9;
					
					System.out.println(Arrays.toString(numbers));
						int [] number  =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11} ;
				
				
				System.out.println(Arrays.toString(number));
				
				String [] namese = { "bala", "mubarak"};
				System.out.println(namese.toString());
			
				// Arrays and Indexes 
					int [] numberse = { 2, 8, 1, 4, 100 , 4, 99, 78 };
					
					int oneHundred = numberse[3] ; 
					int four = numberse[numberse.length - 1] ;
						
						System.out.println(oneHundred);
						System.out.println(four);
			
				// ++ & -- loops ( ++ -- += -=)
						int number1 = 12,
								number0 = 14,
								number2 = 26,
								number3 = 27;
						number1++;
						number0 += 7;
						number3 -= 9;
						number2--;
						System.out.println(number3);
						System.out.println(number0);
						System.out.println(number1);
						System.out.println(number2);
			
			// ENHANCED for LOOP
						int loopnumber [] = { 100, 102, 103, 104, 105, 209} ;
						String[] names2 = {"tobi", "tolu"}; 
						
						Arrays.stream(loopnumber).forEach(System.out::println);
						Arrays.stream(names2).forEach(System.out::println);
						
						for (int i = 0; i < loopnumber.length; i++) {
							 System.out.println(loopnumber[i]); 
						 }
						 
						 System.out.println("Enhanced For Loop");
						 
						 for (int numbe2 : loopnumber) {
							System.out.println(numbe2);
						
						for (String nowe : names2) {
							System.out.println(nowe);
						}	
			
					
			
				//if Statements 
					int age = 14;
					if (age >= 18) {
						System.out.println(" Wow i'm an adult ");
					} else if (age >= 16 && age < 18){
						System.out.println("I'm almost an adult" ) ;
					} else {
						System.out.println("I'm not an adult");
					}
					
					
					
			// Mathematical Operators
					System.out.println(10*2);
					System.out.println(10+2);
					System.out.println(10-2);
					System.out.println(10/2);
			//BODMAS
					System.out.println(10 * (2 + 7) - 4.5);
					System.out.println(10 * 2 + 7 );
			//MATH
					int r = 10;
					
					System.out.println(Math.abs(-10));
					System.out.println(Math.max(6, 10));
					System.out.println(Math.min(6, 10));
					System.out.println((int)Math.pow(5, 2));
					System.out.println(Math.pow(5, 0));
					System.out.println((int)Math.sqrt(25));
					System.out.println( "the circumference of a circle is = " + (int)2 * Math.PI * r );
			
			// comparison Operators 	
					int michaelAge = 16;
					int EniolaAge = 14; 
					System.out.println(michaelAge > EniolaAge);
					System.out.println(michaelAge < EniolaAge);
					System.out.println(michaelAge <= EniolaAge);
					System.out.println(michaelAge >= EniolaAge);
					System.out.println(michaelAge ==EniolaAge);
					System.out.println(michaelAge != EniolaAge);
				
			//Logical Operators 
					boolean isAdult = false;
					boolean isStudent = true;
					boolean isAmigoscodeMember = true;
					System.out.println((isAdult || isStudent) && 
							isAmigoscodeMember);
					System.out.println((isAdult || isStudent) && 
							!isAmigoscodeMember);
					System.out.println(!isAdult);
					
					String name11 = "mark";
					System.out.println((10 > 8 || 2 <= 2) && 
							isAdult &&
							name11.contains("m"));
					
			//packages and import
					Date date = new Date();
					String s = new String(); 
					LocalDate localDate = LocalDate.now();
					java.sql.Date dateSql = new java.sql.Date(1);
					System.out.println(s + localDate );
					System.out.println(dateSql);
			
				LocalDate now = LocalDate.now();
					System.out.println(now);
				
				LocalTime now2 = LocalTime.now();
					System.out.println(now2);	
							
			//Strings			
					String name = new String("Amigoscode");
					System.out.println(name.toUpperCase());
					System.out.println(name.toLowerCase());
					System.out.println(name.charAt(1));
					String code = new String("code"); 
					
					System.out.println(name.contains(code));
					
					System.out.println(name.equals(code));
				
					
				int a = 10;
				int b =a; 
					a = 100;
				System.out.println("a " + a + " - b " + b);
				
				


				
			//breaks and continue 
				
					String[] bAndc = {"Anna", "Mike", "Bob", "Sing"}; 
						for (String bandc : bAndc  ) {
					
							if (bandc.equals("Bob")) {
								break;
							}
							if (bandc.startsWith("B")) {
								continue;
					
					}
					System.out.println(bandc);
				}
					}
			//while loop
						 int count = 0 ;
						
					while (count <= 20 ) {
						count++;
						System.out.printf("count:", count );
					}
			// TODO Auto-generated method stub
					
					System.out.println("i wanna work with someone");
			//FIRST JAVA PROGRAM
					int firstNumber = 56,
							secondNumber = 57,
							thirdNumber = 59,
							sum = firstNumber + secondNumber + thirdNumber,
							products = firstNumber * secondNumber * thirdNumber,
							average = sum / 3;
							
					if(firstNumber > secondNumber && firstNumber > thirdNumber)
						System.out.println("First number is the highest number\n");

					if(secondNumber > firstNumber && secondNumber > thirdNumber)
						System.out.println("Second number is the highest number\n");

					if(thirdNumber > firstNumber && thirdNumber > secondNumber)
						System.out.println("Third number is the highest number\n");

			//Checking for the smallest number

					if(firstNumber < secondNumber && firstNumber < thirdNumber)
						System.out.println("First number is the lowest integer ");


					if(secondNumber < firstNumber && secondNumber < thirdNumber)
						System.out.println("Second number is the lowest integer");


					if(thirdNumber < firstNumber && thirdNumber < secondNumber)
						System.out.println("Third number is the lowest integer. ");

			//Welcome3.java
					System.out.printf("The sum of the numbers is =>%d%n", sum);
					System.out.printf("The products of the numbers is =>%d%n", products);
					System.out.printf("The average of the numbers is =>%d%n", average);
					// TODO Auto-generated method stub
					System.out.println("Welcome \nto \nJava \nProgramming");
					System.out.println("THis \tis a \tcofiguration for the \ttextbook");
					System.out.println("th\\is is a \\configuration for \rnow \r now");
					System.out.print("\"TODAY IS THE LAST DAY OF THIS SECOND WEEK\"\n"); 
					System.out.println("1, 2, 3, 4.");
					System.out.print("1 ");
					System.out.print("2 ");
					System.out.print("3 ");
					System.out.print("4 ");
					System.out.printf("\n%d, %d, %d, %d %n", 1, 2, 3, 4 );	
		//Welcome4.java
					System.out.printf("%s%n%s%n",
							"Welcome to", "Java Programming!");			
					
		//Welcome2.java
					System.out.print("Welcome to ");
					System.out.println("Java Programming!");				
					
		//Welcome1.java
					System.out.println("Welcome to Java Programming!");
		
		//Comparison
					int numberOne = 2000; // first number to compare
					 int numberTwo = 1356; // second number to compare
					
					 System.out.print("Enter first integer: 2000\n"); // prompt 
			 
					
					 System.out.print("Enter second integer: 1356\n"); // prompt 
					 
					 
					if (numberOne == numberTwo) 
					 System.out.printf("%d == %d%n", numberOne, numberTwo);
					
					if (numberOne != numberTwo) 
					 System.out.printf("%d != %d%n", numberOne, numberTwo);
					
					if (numberOne < numberTwo) 
					 System.out.printf("%d < %d%n", numberOne, numberTwo);
					
					if (numberOne > numberTwo) 
						 System.out.printf("%d > %d%n", numberOne, numberTwo);
					
					if (numberOne <= numberTwo) 
						 System.out.printf("%d <= %d%n", numberOne, numberTwo);
					
					if (numberOne >= numberTwo) 
						 System.out.printf("%d >= %d%n", numberOne, numberTwo);

			//Addition 
					int Number3 = 57, //first number to add
						 	number4 = 76, //second number to add
						 	sum2 = number3 + number4; //sum of number1 and number2
					
						System.out.print("Enter first integer: 57\n"); //prompt
					
						System.out.print("Enter second integer: 76\n"); //prompt
						
						System.out.printf("Sum is %d%n", sum2 ); // display sum
			
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
					
		}
	}
