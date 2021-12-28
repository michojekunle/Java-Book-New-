package ChapterThreeExercises;
//Fig 3.2: AccountTest.java
//Creating and Manipulating an Account Object. 
import java.util.Scanner;
public class ModifiedAccountTest2 
{
		public static void main(String[] args) 
		{
			
			ModifiedAccount account1 = new ModifiedAccount("Jana Green", 50.00);
			ModifiedAccount account2 = new ModifiedAccount("John Blue", -7.53); 
			
			//display initial balance of each object 
			dispalyAccount(account1);
			dispalyAccount(account2);
			
			//create a Scanner to obtain input from the command window 
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter 1 to Deposit into account1\nEnter 2 to Withdraw from account1");
			int ans = input.nextInt();
			
			if (ans == 1)
			{
				System.out.printf("Enter deposit Amount for account1: "); //prompt 
				double depositAmount = input.nextDouble(); //obtain user input 
				System.out.printf("%nadding  %.2f to account1 balance %n%n", 
						depositAmount);
				account1.deposit(depositAmount); //add to account1's balance
			}
			else
				if(ans == 2)
				{
					System.out.printf("Enter withdraw Amount for account1: "); //prompt 
					double withdrawAmount = input.nextDouble(); //obtain user input 
					System.out.printf("%ndeducting  %.2f from account1 balance %n%n", 
						withdrawAmount);
					account1.withdraw(withdrawAmount); //add to account1's balance
				}
				
			//display balances 
			dispalyAccount(account1);
			dispalyAccount(account2);
			
			System.out.println("Enter 1 to Deposit into account2\nEnter 2 to Withdraw from account2");
			ans = input.nextInt();
			
			if (ans == 1)
			{
				System.out.printf("Enter deposit Amount for account2: "); //prompt 
				double depositAmount = input.nextDouble(); //obtain user input 
				System.out.printf("%nadding  %.2f to account2 balance %n%n", 
						depositAmount);
				account2.deposit(depositAmount); //add to account1's balance
			}
			else
				if(ans == 2)
				{
					System.out.printf("Enter withdraw Amount for account2: "); //prompt 
					double withdrawAmount = input.nextDouble(); //obtain user input 
					System.out.printf("%ndeducting  %.2f from account2 balance %n%n", 
						withdrawAmount);
					account2.withdraw(withdrawAmount); //add to account1's balance
				}
			//display balances 
			dispalyAccount(account1);
			dispalyAccount(account2);
	}
		public static void dispalyAccount(ModifiedAccount accountToDisplay)
		{
			System.out.printf("%s balance: $%.2f%n",
				accountToDisplay.getName(), accountToDisplay.getBalance());
		}
		
}//end class AccountTest