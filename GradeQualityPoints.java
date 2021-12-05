package ChapterSixExercises;

import java.util.Scanner;
public class GradeQualityPoints 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Grade: ");
		int grade = scan.nextInt();
		
		System.out.println("Your GradePoint is: " + qualityPoints(grade));
	}
	
	public static int qualityPoints(int grade )
	{
		int gradePoint = 0;
		
		if (grade >= 90 && grade <= 100 )
			gradePoint = 4;
		else
			if (grade >= 80 && grade < 90 )
				gradePoint = 3;
			else
				if (grade >= 70 && grade < 80 )
					gradePoint = 2;
				else
					if (grade >= 60 && grade < 70 )
						gradePoint = 1;
					else 
						if (grade < 60)
							gradePoint = 0;
		return gradePoint;
	}
}
