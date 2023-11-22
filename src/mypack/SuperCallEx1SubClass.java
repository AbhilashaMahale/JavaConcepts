package mypack;

public class SuperCallEx1SubClass extends SuperCallEx1SuperClass{
	public SuperCallEx1SubClass()
	{
		super();
		System.out.println("zero argument constructor of Sub Class");
	}
	
	public SuperCallEx1SubClass(int a, int b)
	{
		super(5,6);
		System.out.println("parameterized constructor of Sub Class");
	}

}
