import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Book {

	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	private int stock;
	
	
	public Book(String aTitle, String anAuthor, String aDescription) {
		// TODO Auto-generated constructor stub
		title= aTitle;
		author=anAuthor;
		description=aDescription;
		
	}
	
	public Book(String aTitle, String anAuthor, String aDescription, double aPrice) {
		title= aTitle;
		author=anAuthor;
		description=aDescription;
		price=aPrice;
			
	}
	
	public Book(String aTitle, String anAuthor, String aDescription, double aPrice, boolean anIsInStock) {
		title= aTitle;
		author=anAuthor;
		description=aDescription;
		price=aPrice;
		isInStock=anIsInStock;
		
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getDescription()
	{
		return description;
	}
	public String getauthor()
	{
		return author;
	}
	public double getPrice()
	{
		
		
		return price;
	}
	public boolean isInStock()
	{
	return isInStock;	
	}
	public int getStock()
	{
		return stock;
	}
	
	public void setTitle(String aTitle)
	{
		title=aTitle;
	}
	public void setAuthor(String anAuthor)
	{
		author=anAuthor;
	}
	public void setDescription(String aDesc)
	{
		description=aDesc;
	}
	public void setPrice(double aPrice)
	{
		price=aPrice;
	}
	public void setIsInStock(boolean isStock)
	{
		isInStock=isStock;
	}
	public void setStock(int aStock)
	{
		if(aStock!=0)
		{
			
			isInStock=true;
			
	
		}
		else
		{
			isInStock=false;
		}
		stock=aStock;
	}
	
	public String getPricing(int numBooks)
	{
		if(isInStock)
		{
			
			if(stock>=numBooks)
			{
				DecimalFormat df= new DecimalFormat("#.##");
				df.setRoundingMode(RoundingMode.DOWN);
				return numBooks+" books costs $"+df.format((price*numBooks));
			}
			else
			{
				return "There is an insufficient number of books";
			}
		}
		else
		{
			return "This book is not in stock";
		}
		
	}
	
	
	public void getDisplayText()
	{
		System.out.printf("Title: %s\nAuthor: %s\nDescription: %s\n", title, author, description);
	}
}

