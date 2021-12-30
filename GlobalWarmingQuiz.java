package ChapterFiveExercises;
// Exercise 5.31 GlobalWarmingQuiz
import java.util.Scanner;

public class GlobalWarmingQuiz 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String answer1, answer2, answer3, answer4, answer5;
		int correct = 0, wrong = 0;
		
		System.out.println("Question 1 \nGlobal warming is the ________ in(of) temperature of "
				+ "the earth as time passes\nAnswer:");
		answer1 = s.nextLine();
		switch (answer1.toLowerCase())
		{
		case "increase":
			correct += 1;
			break;
		case "rise" : 
			correct += 1;
			break;
		case "hype" :
			correct += 1;
			break;
		case "build up" :
			correct += 1;
			break;	
		default :
				wrong += 1;		
		}
		
		System.out.println("Question 2 \nWhat causes global warming ______________________\nAnswer:");
		answer2 = s.nextLine();
		switch (answer2.toLowerCase())
		{
		case "greenhouse gases":
			correct += 1;
			break;
		case "greenhouse effect" : 
			correct += 1;
			break;
		case "carbondioxde" :
			correct += 1;
			break;
		case "co2 emmisions" :
			correct += 1;
			break;	
		default :
				wrong += 1;		
		}
		
		System.out.println("Question 3 \nMention a common effect of global warming ________________\nAnswer:");
		answer3 = s.nextLine();
		switch (answer3.toLowerCase())
		{
		case "rising sea levels":
			correct += 1;
			break;
		case "dissappearing glaciers" : 
			correct += 1;
			break;
		case "extinction" :
			correct += 1;
			break;
		case "air pollution" :
			correct += 1;
			break;	
		default :
				wrong += 1;		
		}
		
		System.out.println("Question 4 \nHow is global warming linked to "
				+ "extreme weather _________________\nAnswer:");
		answer4 = s.nextLine();
		switch (answer4.toLowerCase())
		{
		case "longer and hotter heat waves":
			correct += 1;
			break;
		case "frequent droughts" : 
			correct += 1;
			break;
		case "powerful hurricanes" :
			correct += 1;
			break;
		case "heavy rainfall" :
			correct += 1;
			break;	
		default :
				wrong += 1;		
		}
		
		System.out.println("Question 5 \nMention one solution to global warming \nAnswer:");
		answer5 = s.nextLine();
		switch (answer5.toLowerCase())
		{
		case "afforestation":
			correct += 1;
			break;
		case "recycling" : 
			correct += 1;
			break;
		case "stop open burning" :
			correct += 1;
			break;
		case "reduce gasoline" :
			correct += 1;
			break;	
		default :
				wrong += 1;		
		}
		
		if (correct == 5)
			System.out.println("Excellent");
		else 
			if (correct == 4)
				System.out.println("Very Good");
			else 
				if (correct <= 3)
					System.out.println("Time to brush up on your knowledge of global warming."
							+ "\nhttps://www.ukessays.com/essays/environmental-science/"
							+ "causes-effects-and-solutions-to-global-warming-environmental-sciences-essay.php");
		System.out.println("correct answers: "+correct+ "\nWrong answers: "+wrong);
	}
}
