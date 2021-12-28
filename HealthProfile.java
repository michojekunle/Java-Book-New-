package ChapterThreeExercises;

public class HealthProfile  
{
    String firstName, lastName, gender;
    int day, month, year;
    double weight, height;
    
    public HealthProfile(String firstName, String lastName,String gender, int day, int month, int year, double height, double weight)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.month = month;
      this.day = day;
      this.year = year;
      this.height = height;
      this.weight = weight;
    }
    
    public void setFirstName(String firstName)
    {
      this.firstName = firstName ;
    }
     
    public String getFirstName()
    {
      return firstName;
    }
    
    public void setLastName(String lastName)
    {
      this.lastName = lastName ;
    }
     
    public String getLastName()
    {
      return lastName;
    }
    
    public void setGender(String gender)
    {
      this.gender = gender ;
    }
     
    public String getGender()
    {
      return gender;
    }
    
    public void setYear(int year)
    {
      this.year = year ;
    }
     
    public int getYear()
    {
      return year;
    }    
   
    public void setMonth(int month)
    {
      this.month = month ;
    }
     
    public int getMonth()
    {
      return month;
    }
    public void setDay(int day)
    {
      this.day = day ;
    }
     
    public int getDay()
    {
      return day;
    }
    
    public void setWeight(double weight)
    {
      this.weight = weight ;
    }
     
    public double getWeight()
    {
      return weight;
    }
    
    public void setHeight(double height)
    {
      this.height = height ;
    }
     
    public double getHeight()
    {
      return height;
    }
    public int calYear(int year)
    {
      int age;
      age = 2021 - year;
      return age;
    }

    public int maxHrtRt(int year)
    {
      int age = calYear(year);
      int maxHrtRate = 220 - age;
      return maxHrtRate;
    }
    
    public void targetHrtRt(int year)
    {
      int maxHrtRate = maxHrtRt(year);
      
      int targHrtRt = 1 * maxHrtRate / 2;
      int finTHR = 17 * maxHrtRate / 20;
      System.out.printf("Your Target Heart Rate is within %d-%d.%n", targHrtRt, finTHR);
    }
    
    public void displayBMIValues()
    {
    	System.out.println();
    	System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 25.9\n"
				+ "Overweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater.");
    }
    
    public void calcBMI() 
    {
    	double BMI = (weight * 703) / (height * height) ;
		
		System.out.printf("Your BMI(Body Mass Index) is: %.1f%n", BMI);
		
		if (BMI<18.5)
			System.out.println("You are Underweight.");
		else 
			if (BMI >= 18.5 && BMI <= 24.9)
				System.out.println("You are normal.");
			else 
				if (BMI >= 25 && BMI <= 29.9)
					System.out.println("You are Overweight.");
				else 
					if (BMI >= 30)
						System.out.println("You are Obese.");
    }
}