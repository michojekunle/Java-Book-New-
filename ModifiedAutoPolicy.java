package ChapterFiveExercises;
//Exercise 5.30 Modified AutoPolicy
public class ModifiedAutoPolicy 
{
		private int accountNumber; // policy account number 
		private String makeAndModel; // car that policy applies to 
		private String state; // two-letter state abbreviation 
		
		//constructor
		public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state)
		{
			this.accountNumber = accountNumber;
			this.makeAndModel = makeAndModel;
			this.state = state ;
		}
		
		//sets the accountNumber 
		public void setAccountNumber(int accountNumber)
		{
			this.accountNumber = accountNumber;
		}
		
		//returns the accountNumber
		public int getAcountNumber()
		{
			return accountNumber;
		}
		
		//sets the makeAndModel
		public void setMakeAndModel(String makeAndModel)
		{
			this.makeAndModel= makeAndModel;
		}
		
		// returns the makeAndModel
		public String getMakeAndModel()
		{
			return  makeAndModel;		
		}
		
		//sets the state 
		public void setState(String state)
		{
			if (state == "MA" || state == "NJ"|| state == "NY" || state == "PA"
					|| state == "VT"|| state == "NH"|| state == "ME"|| state == "CT")
				this.state = state;
			else 
				System.out.println("Error !!! incorrect input");
		}
		
		//returns the state 
		public String getState()
		{
			return state;
		}
		
		// predicate method returns whether the state has no-fault insurance 
		public boolean isNoFaultState()
		{
			boolean noFaultState;
			
			//determine whether state has no-fault auto insurance
			switch (getState()) // get AutoPolicy object's state abbreviation
			{
			case "MA":
			case "NJ": 
			case "NY": 
			case "PA": 
			case "CT": 
			case "ME": 
			case "NH": 
			case "VT":
				noFaultState = true;
				break;
			default:
				noFaultState = false;
				break;
			}
			
			return noFaultState;
	}
}