package ChapterThreeExercises;
// Exercise 3.12 invoice.java
public class Invoice 
{
	String partNumber;
	String partDescription;
	int qyItems;
	double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int qyItems, double pricePerItem)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.qyItems = qyItems;
		this.pricePerItem = pricePerItem;		
	}
	
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	
	public String getPartNUmber()
	{
		return partNumber;
	}
	
	public void setPartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}
	
	public String getPartDescription()
	{
		return partDescription;
	}
	
	public void setQyItems(int qyItems)
	{
		this.qyItems = qyItems;
	}
	
	public int getQyItems()
	{
		return qyItems;
	}
	
	public void setPricePerItem(double pricePerItem)
	{
		this.pricePerItem = pricePerItem;
	}
	
	public double getPricePerItem()
	{
		return pricePerItem;
	}

	public double getInvoiceAmount()
	{
		double invoiceAmount;
		
		invoiceAmount = qyItems * pricePerItem;
		
		if (pricePerItem < 0)
		{
			if (qyItems < 0)
				invoiceAmount = 0;
		}
		return invoiceAmount;
	}
}