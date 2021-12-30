package ChapterFiveExercises;
//Exercise 5.29 Printing the lyrics of the song twelve days of Christmas
public class TheTwelveDaysOfChristmas 
{
	public static void main(String[] args) 
	{
		int number;
		int rem;
		int count ;
	
		for (count = 1; count <= 12; count++)
		{
			number = count;
			
			switch (number)
			{
			case 1:
				System.out.println("On the first day of christmas, My true love sent to me: ");
				break;
			case 2:
				System.out.println("On the second day of christmas, My true love sent to me: ");
				break;
			case 3:
				System.out.println("On the third day of christmas, My true love sent to me: ");
				break;
			case 4:
				System.out.println("On the fourth day of christmas, My true love sent to me: ");
				break;
			case 5:
				System.out.println("On the fifth day of christmas, My true love sent to me: ");
				break;
			case 6:
				System.out.println("On the sixth day of christmas, My true love sent to me: ");
				break;
			case 7:
				System.out.println("On the seventh day of christmas, My true love sent to me: ");
				break;
			case 8:
				System.out.println("On the eight day of christmas, My true love sent to me: ");
				break;
			case 9:
				System.out.println("On the ninth day of christmas, My true love sent to me: ");
				break;
			case 10:
				System.out.println("On the tenth day of christmas, My true love sent to me: ");
				break;
			case 11:
				System.out.println("On the eleventh day of christmas, My true love sent to me: ");
				break;
			case 12:
				System.out.println("On the twelfth day of christmas, My true love sent to me: ");
				break;
			}		
			for (int x = count;x > 0 ; x--)
			{
				rem = x;
					switch (rem)
					{
					case 1:
						System.out.print("a patridge in a pear tree\n");
						break;
					case 2:
						System.out.print("two turtle doves and \n");
						break;
					case 3:
						System.out.print("three french hens\n");
						break;
					case 4:
						System.out.print("four calling birds\n");
						break;
					case 5:
						System.out.print("five golden rings\n");
						break;
					case 6:
						System.out.print("six geese are laying\n");
						break;
					case 7:
						System.out.print("seven swarm are swimming\n");
						break;
					case 8:
						System.out.print("eight maize are milking\n");
						break;
					case 9:
						System.out.print("Nine ladies dancing\n");
						break;
					case 10:
						System.out.print("ten lords are leaping\n");
						break;
					case 11:
						System.out.print("eleven pipe are peeping\n");
						break;
					case 12:
						System.out.print("Twelve Drummmers drumming\n");
						break;
					}
				}
			System.out.println("\n");
		}
	}
}
