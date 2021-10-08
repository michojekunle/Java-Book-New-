package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

public class Main {

		public static void main(String[] args) {
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
		
			
			
		}
	}
