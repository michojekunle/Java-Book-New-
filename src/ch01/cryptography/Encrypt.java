package ch01.cryptography;
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        //Creating new scanner objects to receive input from the command line
        Scanner data = new Scanner(System.in);
        System.out.print("Enter data to be Encrypted: ");
        int input = data.nextInt();

        int fourthDigit = input % 10;
        int thirdDigit = (input/10) % 10;
        int secondDigit = (input/100) % 10;
        int firstDigit = (input/1000) % 10;

        int newFirstDigit = (thirdDigit + 7) % 10;
        int newSecondDigit = (fourthDigit + 7) % 10;
        int newThirdDigit = (firstDigit + 7) % 10;
        int newFourthDigit = (secondDigit + 7) %10;

        int output = newFirstDigit*1000 + newSecondDigit*100 + newThirdDigit*10 + newFourthDigit;

        System.out.printf("Original: %d  %d  %d  %d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
        System.out.printf("Encrypted: %d  %d  %d  %d%n%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);

        System.out.printf("Encrypted Output: %d%n%n", output);
    }
}
