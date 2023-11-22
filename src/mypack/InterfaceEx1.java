package mypack;

public interface InterfaceEx1 {
	
	int a = 34; //is by default static and final
	//InterfaceEx1 E = new InterfaceEx1();//object cannot be created.
	//InterfaceEx1 E1;//reference variable allowed
	public void test();// test() method is public and abstract
	//private void test2();// cannot make non static method as private as we cannot abstract this later
	//public abstract static void test1();//we cannot declare two modifiers static and abstract
	public static void add()
	{
		System.out.println("Concrete Method of interface component");
	}
   
	//private or protected is  is allowed for static method
	private static void add1()
	{
		System.out.println("not allowed as it is ");
	}
	
	public static void main(String [] args) {
		System.out.println("hello ");
		add();
	}
	
}
