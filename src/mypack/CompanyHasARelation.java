package mypack;

public class CompanyHasARelation {
	String CompanyName;
	String Location;
	
	public CompanyHasARelation(String CompanyName, String Location) {

		this.CompanyName = CompanyName;
		this.Location = Location;
	}
	
	EmployeeHasARelation e = new EmployeeHasARelation("Abhilasha",111);
	
	 public void print()
	 {
		 System.out.println("Details of the Company are");
	     System.out.println("CompanyName is "+CompanyName);		
		 System.out.println("Location is "+Location);
	 }

}
