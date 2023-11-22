package mypack;

public class AbstractExDriverClass {
	public static void main(String[] args) {
		
		System.out.println("hello");
		//abstract class we cannot create object
		AbstractExSubClass sub = new AbstractExSubClass();
		sub.sub2();
		sub.test();
		sub.test1();
		sub.add();
		
	}

}
