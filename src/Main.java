// Fig 2.7: Addition.java
// Addition program that inputs two numbers and displays their sum.
import java.util.Scanner ; //program uses class Scanner

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of number1 and number2

        System.out.print("Enter first integer: "); //prompt
        number1 = input.nextInt(); //read first number from the user

        System.out.print("Enter second integer: "); //prompt
        number2 = input.nextInt(); //read second integer;
        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}