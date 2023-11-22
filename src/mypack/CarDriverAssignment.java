package mypack;

public class CarDriverAssignment {
	public static void main(String[] args)
	{
		Car1 c1 = new Car1();
		c1.drive();
		System.out.println(c1.price);
		System.out.println(c1.brand);
		
		System.out.println("========");
		Car2 c2 = new Car2();
		c2.playmusic();
		System.out.println(c2.cc);
		System.out.println(c2.price);
		System.out.println(c2.brand);
	}


}
