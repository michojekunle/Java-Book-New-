package ChapterFiveExercises;
// Exercise 5.19 
public class Try 
{
	public static void main(String[] args) 
	{
		int i = 1, j = 2, k = 3, m = 2;
		
		System.out.println(i == 1);
		System.out.println(j == 3);
		System.out.println((i >= 1) && (j < 4));
		System.out.println((m <= 99) & (k < m));
		System.out.println((j >= i) || (k == m));
		System.out.println((k + m < j) | ( 3 - j >= k));
		System.out.println(!(k > m));
	}

}
