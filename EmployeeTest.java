package ChapterThreeExercises;
// Exercise 3.13 EmployeeTest class                                              
public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Ayomide", "Barakat", 4000);
		Employee employee2 = new Employee("Shade", "Shile", 15000);
		
		System.out.printf("The yearly salary for %s %s is %.2f%n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getMonSalary() * 12);

		System.out.printf("The yearly salary for %s %s is %.2f%n%n%n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getMonSalary() * 12);
		
		employee1 = new Employee("Ayomide", "Barakat", 4400); 
		employee2 = new Employee("Shade", "Shile", 16500);

		System.out.println("After a 10% increase in the salary of employees;\n");
		
		System.out.printf("The new yearly salary for %s %s is %.2f%n",
				employee1.getFirstName(), employee1.getLastName(), employee1.getMonSalary() * 12);

		System.out.printf("The new yearly salary for %s %s is %.2f%n%n%n",
				employee2.getFirstName(), employee2.getLastName(), employee2.getMonSalary() * 12);

	
	}
}
