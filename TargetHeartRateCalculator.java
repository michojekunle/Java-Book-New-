package ChapterThreeExercises;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TargetHeartRateCalculator 
{
    String firstName;
    String lastName;
    int day, month, year;
    
    public TargetHeartRateCalculator(String firstName, String lastName, int day, int month, int year)
    {
      this.firstName = firstName;
      this.lastName = lastName;
      this.month = month;
      this.day = day;
      this.year = year;
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
    
    public static int calYear(int year)
    {
      int age;
      age = 2021 - year;
      return age;
    }

    public static int maxHrtRt(int year)
    {
      int age = calYear(year);
      int maxHrtRate = 220 - age;
      return maxHrtRate;
    }
    
    public static void targetHrtRt(int year)
    {
      int maxHrtRate = maxHrtRt(year);
      
      int targHrtRt = 1 * maxHrtRate / 2;
      int finTHR = 17 * maxHrtRate / 20;
      System.out.printf("Your Target Heart Rate is within %d-%d.%n%n", targHrtRt, finTHR);
    }
    
  
   public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter your First Name");
     String firstName = sc.next();
  
    System.out.println("Enter your Last Name");
     String lastName = sc.next();
     
     System.out.println("Enter your month of birth");
     int month = sc.nextInt();
     
     System.out.println("Enter your day of birth");
     int day = sc.nextInt();

     System.out.println("Enter your year of birth");
     int year = sc.nextInt();
     
     System.out.printf("You are %d years old%n%n", calYear(year));
     System.out.printf("Your Maximum heart rate is %d.%n%n", maxHrtRt(year));
     
     targetHrtRt(year);
  }

}