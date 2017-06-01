
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book lotr= new Book("Lord of the Rings", "J.R.R. Tolkien","The Fantastical Epic story of a journey save the world", 10.55);
		lotr.getDisplayText();
		
		
		System.out.println(lotr.getPricing(5));
		lotr.setStock(6);
		System.out.println(lotr.getPricing(5));

	}

}
