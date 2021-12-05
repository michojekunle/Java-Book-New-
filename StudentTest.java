package ChapterFour;

public class StudentTest {

	public static void main(String[] args) 
	{
		 Student account1 = new Student("Ayomide", 100.0) ;
	        Student account2 = new Student("John Green", 70.5);

	        System.out.printf("%s's letter grade is: %s%n ", account1.getName(), account1.getLetterGrade());
	        System.out.printf("%s's letter grade is: %s%n ", account2.getName(), account2.getLetterGrade());
	}

}
