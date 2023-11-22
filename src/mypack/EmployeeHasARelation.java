package mypack;

public class EmployeeHasARelation {

	String EmployeeName;
	int Id;

	public EmployeeHasARelation(String EmployeeName, int Id) {
		this.EmployeeName = EmployeeName;
		this.Id = Id;
	}

	public void disp() {
		System.out.println("Details of the Employee are");
		System.out.println("EmployeeName is "+EmployeeName);		
		System.out.println("Id is "+Id);
	}
}
