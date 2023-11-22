package mypack;

public class BookHasARelation {
	String Author;
	int price;
	
	public BookHasARelation(String author, int price) {
		this.Author = author;
		this.price = price;
	}

	public void disp() {
		System.out.println("details of the book is");
		System.out.println("Author is "+Author);
		System.out.println("price is "+price);
	}

}
