package mypack;

public class DriverHasARelation {
	public static void main(String[] args)
	{
		LibraryHasARelation L = new LibraryHasARelation(20,"Technical");
		L.print();
		System.out.println("========");
		L.b.disp();
	    
	}

}
