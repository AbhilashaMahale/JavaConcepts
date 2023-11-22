package mypack;

public class Car {	

String modelname;
String carcolour;
	
	public Car(String modelname, String carcolour) 
	{
	   this.modelname = modelname;
		this.carcolour = carcolour;
	}	
	
	Program1 e = new Program1(23,"900cc");

	public void disp()
	{
		System.out.println("the car details are");
		System.out.println("model name:"+modelname);
		System.out.println("car colour is"+carcolour);
	}
}
