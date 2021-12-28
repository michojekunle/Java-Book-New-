package ChapterThreeExercises;
// Exercise 3.13 Eployee class
public class Employee 
{
	String firstName; 
	String lastName;
	double monSalary;
	
	public Employee(String firstName, String lastName, double monSalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if(monSalary >= 0 )
			this.monSalary = monSalary;
	}
	
	public void setFirstyName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setMonSalary(double monSalary)
	{
		this.monSalary = monSalary;
	}
	
	public double getMonSalary()
	{
		return monSalary;
	}	
}