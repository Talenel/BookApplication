
public class Book {

	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	
	
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
	public void setIsInStock(boolean stock)
	{
		isInStock=stock;
	}
	
	
	public void getDisplayText()
	{
		System.out.printf("Title: %s\nAuthor: %s\nDescription: %s", title, author, description);
	}
}

