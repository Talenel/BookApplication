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
	public Book(String sku)
	{
		if(sku.equals("Java1001"))
		{
			title="Head First Java";
			author="Kathy Sierra and Bert Bates";
			description="Easy to read Java workbook";
			price=47.50;
			
		}
		else if(sku.equals("Java1002"))
		{
			title="Thinking in Java";
			author="Bruce Eckel";
			description="Details about Java under the hood";
			price=20.00;
		}
		else if(sku.equals("Orcl1003"))
		{
			title="OCP:Oracle Certified Professional Java SE";
			author="Jeanne Boyarsky";
			description="Everything you need to know in one place";
			price=45.00;
		}
		else if(sku.equals("Python1004"))
		{
			title="Automate the Boring Stuff with Python";
			author="Al Sweigart";
			description="Fun with Python"; 
			price=10.50;
		}
		else if(sku.equals("Zombie1005"))
		{
			title="The Maker's Guide to the Zombie Apocalypse";
			author="Simon Monk";
			description="Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi";
			price=16.50;
		}
		else if(sku.equals("Rasp1006"))
		{
			title="Raspberry Pi Projects for the Evil Genius";
			author="Donald Norris";
			description="A dozen fiendishly fun projects for the Raspberry Pi";
			price=14.75;
		}
		else
		{
			title="Not found";
			author="Unknown";
			description="Not a valid sku";
			price=0;
		}
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
	
	
	public String getDisplayText()
	{
		return "Title: "+title+"%s\nAuthor: "+author+"\nDescription: "+description+"\n";
	}
}

