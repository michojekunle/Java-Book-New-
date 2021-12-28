package ChapterFourExercises;
//Exercise 4.22
public class TabularOutput 
{
	public static void main(String[] args) 
	{
		int count = 1;
		//display the headers
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		while (count <= 5)
		{
			System.out.println(count+ "\t"+count * 10+ "\t"+count * 100+ "\t"+count * 1000);
			
			count++;
		}
		
	}

}
