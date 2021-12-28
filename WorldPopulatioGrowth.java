package ChapterFourExercises;
//Exercise 4.39 calculating the world population growth rate for the next seventy-five years

public class WorldPopulatioGrowth 
{
	public static void main(String[] args) 
	{
		int count = 1, year = 2021;
		double worldPop = 7916071150L, newWorldPop = worldPop, temp, increase = 0;
		double growthRate = 1.03;
		int ddouble = 0;
		temp = worldPop;
		
		System.out.printf("Year%20s%30s%n", "Population", "Population Increase");
		
		
		
		while (count <= 75)
		{
			
			System.out.printf("%3d%22.0f%26.0f%n",year, newWorldPop, increase);
			
			newWorldPop = temp * growthRate ;
			increase = newWorldPop - temp;
			temp = newWorldPop;
			
			
			year++;
			count++;
			
			if (newWorldPop >= 2 * worldPop && newWorldPop <= 2.05 * worldPop)
				ddouble = year;
		}
		
		System.out.println("\nThe year in which the population will double its present figure is in the year "+ddouble);
	}

}
