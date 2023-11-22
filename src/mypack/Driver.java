package mypack;

public class Driver {
	public static void main(String[] args)
	{
		//super class object
		A a1 = new A();
		System.out.println(a1.a);
		//a1.a = 23; cannot be re assigned as its final
		System.out.println(a1.b);
		//System.out.println(a1.d);//cannot access subclass properties from superclass
		System.out.println("========");
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.d);
		b1.Count();
		b1.display();
		
	}

}
