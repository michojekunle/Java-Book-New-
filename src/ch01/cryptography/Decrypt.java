package ch01.cryptography;
import java.util.Scanner;
public class Decrypt {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter data to be Decrypted: ");
        int input = data.nextInt();

        int fourthDigit = input % 10;
        int thirdDigit = (input/10) % 10;
        int secondDigit = (input/100) % 10;
        int firstDigit = (input/1000) % 10;

        int orFirstDigit = (thirdDigit + 3) % 10,
            orSecondDigit = (fourthDigit + 3) % 10,
            orThirdDigit = (firstDigit + 3) % 10,
            orFourthDigit = (secondDigit + 3) % 10;

        int output = orFirstDigit*1000 + orSecondDigit*100 + orThirdDigit*10 + orFourthDigit;

        System.out.printf("Encrypted: %d  %d  %d  %d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
        System.out.printf("Decrypted: %d  %d  %d  %d%n", orFirstDigit, orSecondDigit, orThirdDigit, orFourthDigit);

        System.out.printf("Decrypted Output: %d%n", output);
    }
}
