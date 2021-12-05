package ChapterThree;

// Account class that contains a name instance variable 
// and methods to set and get its value
public class Account {

	private String name; // instance variable
	private double balance; // instance variable
	
	// Account constructor that receives two parameters 
	public Account(String name, double balance) 
	{
		this.name = name; // assign name to instance variable name 
		
		//validate that the balance is greater than 0.0
		if(balance > 0.0) //if the balance is valid
			this.balance = balance ; //assign it to the instance variable balance
	}
	
	// method that deposits (adds) only a valid amount to the balance 
	public void deposit(double depositAmount) 
	{
		if(depositAmount > 0.0) //if the deposit Amount is valid 
			balance = balance + depositAmount; // Adds it to the balance
	}
	
	//method that returns the Account balance
	public double getBalance() 
	{
		return balance;
	} 
	
	// method to set the name in the object 
	public void setName(String name) 
	{
		this.name = name; // store the name 
	}
			
	// Method to retrieve the name from the object 
	public String getName()
	{
		return name; // Return value of name to the caller 
	
	}///end method getName
}//end class Account



