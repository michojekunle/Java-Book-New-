package ChapterThreeExercises;
// Exercise 3.12 InvoiceTest.java
public class InvoiceTest 
{
	public static void main(String[] args)
	{
		Invoice invoice1 = new Invoice("01011", "Canned Drink", 20, 350);
		
		System.out.printf("This is the invoice for: %n%nPart Number: %s%nPart Description: %s%nQuantity of Items: %d%n"
				+ "Price Per Item: $%.2f%n%nAnd it all Amounts to $%.2f ",invoice1.getPartNUmber(), invoice1.getPartDescription(), 
				invoice1.getQyItems(), invoice1.getPricePerItem(), invoice1.getInvoiceAmount());
	}
}
