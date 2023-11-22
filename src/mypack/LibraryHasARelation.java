package mypack;

public class LibraryHasARelation {
	int numberofbooks;
	String Typeofbook;
	
	public LibraryHasARelation(int numberofbooks, String typeofbook) {

		this.numberofbooks = numberofbooks;
		this.Typeofbook = typeofbook;
	}
	
	BookHasARelation b = new BookHasARelation("Abhilasha",200);
	
	 public void print()
	 {
		 System.out.println("details in library");
		 System.out.println("number of books is "+numberofbooks);
		 System.out.println("Type of book is "+Typeofbook);
	 }

}
