package ChapterFourExercises;
//Exercise 4.38 Enforcing Privacy with cryptography
import java.util.Scanner;

public class PrivacyWithCryptography 
{
	public static void main(String[] args) 
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter the four digit numbers: ");
		int num1 = sn.nextInt();
		
		System.out.println("Encrypted number is: "+encrypt(num1));
		
		
		System.out.print("Decrypted number is: ");
		decrypt(encrypt(num1));
	}
	public static int encrypt(int num) 
	{
		int rem = 0, temp = num, encrypt = 0;
		
		//third digit encrypted to first digit
		rem = temp % 100;
		rem = rem / 10;
		encrypt = (rem + 7) % 10;
		
		temp = num;
		//fourth digit encrypted to second digit
		rem = temp % 10;
		encrypt = (encrypt * 10) + ((rem + 7) % 10);
		
		temp = num;
		// first digit encrypted to third digit
		rem = temp / 1000;
		encrypt = (encrypt * 10) + ((rem + 7) % 10);
		
		temp = num;
		//second digit encrypted to fourth digit
		rem = temp/100;
		rem = rem % 10;
		encrypt = (encrypt * 10) + ((rem + 7) % 10);
		
	
		return encrypt;
	}
	
	public static void decrypt(int num) 
	{
		int rem = 0, temp = num, decrypt = 0;
		
		rem = temp % 10;
		int deFourFTwo = rem;
		if (deFourFTwo < 7)
			deFourFTwo = (deFourFTwo + 10) - 7;
		else
			deFourFTwo = deFourFTwo - 7;
		temp /= 10;
		
		rem = temp % 10;
		int deThreeFOne = rem;
		if (deThreeFOne < 7)
			deThreeFOne = (deThreeFOne + 10) - 7;
		else
			deThreeFOne = deThreeFOne - 7;

		temp/= 10;
		
		rem = temp % 10;
		int deTwoFFour = rem;
		if (deTwoFFour < 7)
			deTwoFFour = (deTwoFFour + 10) - 7;
		else
			deTwoFFour = deTwoFFour - 7;

		temp/= 10;
		
		rem = temp % 10;
		int deOneFThree = rem;
		if (deOneFThree < 7)
			deOneFThree = (deOneFThree + 10) - 7;
		else
			deOneFThree = deOneFThree - 7;

		temp/= 10;
		
		decrypt = ((deThreeFOne * 10 + deFourFTwo) * 10 + deOneFThree)* 10 +deTwoFFour;
				
		System.out.println(decrypt);
	}
}