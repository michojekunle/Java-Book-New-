package ChapterTwoExercises;
import java.util.Scanner;

public class PositiveOrNegativeOrZeroIntegers 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int x, y, z, w,v, noZ = 0, noP = 0, noN = 0;
		
		System.out.println("Enter five Numbers: ");
		x = s.nextInt();
		y = s.nextInt();
		z = s.nextInt();
		w = s.nextInt();
		v = s.nextInt();
		
		if (x<0)
			noN += 1;
		if (y<0)
			noN += 1;
		if (z<0)
			noN += 1;
		if (v<0)
			noN += 1;
		if (w<0)
			noN += 1;
		
		if (x==0)
			noZ += 1;
		if (y==0)
			noZ += 1;
		if (z==0)
			noZ += 1;
		if (w==0)
			noZ += 1;
		if (v==0)
			noZ += 1;
		
		if (x>0)
			noP += 1;
		if (y>0)
			noP += 1;
		if (z>0)
			noP += 1;
		if (w>0)
			noP += 1;
		if (v>0)
			noP += 1;
		System.out.println("The number of positives among these numbers is: " + noP);
		System.out.println("The number of zeros among these numbers is: " + noZ);
		System.out.println("The number of negatives among these numbers is: " + noN);
	}
}