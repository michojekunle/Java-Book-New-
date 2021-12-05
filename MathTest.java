package ChapterSixExercises;
// testing for the validity of math class 
public class MathTest 
{
	public static void main(String[] args) 
	{
		System.out.println(Math.abs(-13));
		
		System.out.println(Math.ceil(9.2));
		System.out.println(Math.ceil(-9.8));
		
		System.out.println(Math.cos(0));
		
		System.out.println(Math.exp(1));
		System.out.println(Math.exp(2));
		
		System.out.println(Math.floor(9.2));
		System.out.println(Math.floor(-9.8));
		
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log(Math.E * Math.E));
		
		System.out.println(Math.max(3,5));
		System.out.println(Math.max(-13, -14));
		
		System.out.println(Math.min(-13, -20));
		System.out.println(Math.min(13, 20));
		
		System.out.println(Math.pow(2.0, 7.0));
		
		System.out.println(Math.sin(0.0));
		
		System.out.println(Math.sqrt(625));
		
		System.out.println(Math.tan(45));
		
		double x =  Math.ceil(-Math.abs(-8 + Math.floor(-5.5))), 
				y = Math.ceil(-14);
		       
		System.out.println(x + " " + y);
	}
}
