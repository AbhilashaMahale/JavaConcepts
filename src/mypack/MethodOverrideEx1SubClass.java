package mypack;

public class MethodOverrideEx1SubClass extends MethodOverrideEx1SupClass {
	@Override
	public void PrintNumber(int l  ,String m) {
		/////if we want to print the methods from Super Class
		super.PrintNumber(5,"five");
		for (int i = 5;i>0;i--) {
			System.out.print(i+ "");
		}
	}
	
	@Override
	public void StudentDetails() {
		System.out.println("Student Name is "+"Abhilasa");
		System.out.println("Course Name "+"Core Java" + " and Manual Testing");
		System.out.println("Total Coursed completed " +2);
		
	}
}
