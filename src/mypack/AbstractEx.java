package mypack;

public abstract class AbstractEx {
	//abstract method only for non static method
	//public abstract void test();
	
	//cannot have two modifiers abstract and static together
	//public abstract static void test2();
	
	//concrete method
	public void test1() {
		System.out.println("test1() method from superclass");
	}
	
	public static void add() {
		System.out.println("add() method from superclass");
	}
	
	// error as thismethod should be given implementation sometime later
	//but if it is private we cannot use this method in any other class
	//private abstract void test();
  

}
