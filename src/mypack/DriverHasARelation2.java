package mypack;

public class DriverHasARelation2 {
	public static void main(String[] args)
	{
		CompanyHasARelation C = new CompanyHasARelation("QSpiders","Bengaluru");
		C.print();
		System.out.println("========");
		C.e.disp();
	    
	}

}
