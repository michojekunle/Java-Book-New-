package ChapterFourExercises;
// Exercise 4.32 printing a CheckerBoard pattern of asterisks

public class CheckerboardPatternOfAsterisks 
{
	public static void main(String[] args) 
	{
		int row = 16, col =  16;
		printCheckerBoard(row, col);
	}
    public static void printCheckerBoard(int rows, int cols)
    {
        System.out.println("Rows: " + rows+" and Columns: " + cols);
        for(int i=1;i<=rows;i++)
        {
            System.out.print("\t");
            
            for(int j=1;j<=cols;j++)
                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}