package ChapterFiveExercises;
//Exercise 5.23
public class DeMorgansLaw 
{
	public static void main(String[] args) 
	{
		System.out.println("De Morgan's Law: !(condition1 && condition2) "
				+ "= (!condition1 || !condition2) and\n"
				+ " !(condition1 || condition2) = (!condition1 && !condition2).\n\n");

		int x = 10, y = 20 ;
		//a. !(x < 5) && !(y >= 7) = !((x < 5) || (y >= 7))
		System.out.printf("a. !(x < 5) && !(y >= 7) = !((x < 5) || (y >= 7)) --- (%b)%n" ,!(x < 5) && !(y >= 7) == !((x < 5) || (y >= 7)));
		
		int a = 10, b = 12, g = 14;
		//b. !(a == b) || !(g != 5) = !((a == b) && !(g != 5))
		System.out.printf("b. !(a == b) || !(g != 5) = !((a == b) && !(g != 5)) --- (%b)%n", !(a == b) || !(g != 5) == !((a == b) && !(g != 5)));
		
		
		//c. !((x <= 8) && (y > 4)) = (!(x <= 8) || !(y > 4))
		System.out.printf("c. !((x <= 8) && (y > 4)) = (!(x <= 8) || !(y > 4)) --- (%b)%n", !((x <= 8) && (y > 4)) == (!(x <= 8) || !(y > 4)));
		
		int i = 10, j = 12; 
		//d. !((i > 4) || (j <= 6)) = (!(i > 4) && !(j <= 6))
		System.out.printf("d. !((i > 4) || (j <= 6)) = (!(i > 4) && !(j <= 6)) --- (%b)%n",  !((i > 4) || (j <= 6)) == (!(i > 4) && !(j <= 6)));		
	}

}
