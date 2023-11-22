package mypack;

public class SuperCallEx1SuperClass {
	public SuperCallEx1SuperClass()
	{
		super();//inherits properties of Object class implicitly from java.lan package and invokes default constructor
		System.out.println("zero arg constructor for Super Class");
	}
	
	public SuperCallEx1SuperClass(int a, int b)
	{
		super();//inherits properties of Object class implicitly from java.lan package and invokes default constructor
		System.out.println("parameterized  constructor for Super Class");
	}

}
