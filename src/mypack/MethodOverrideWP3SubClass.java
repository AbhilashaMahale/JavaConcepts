package mypack;

public class MethodOverrideWP3SubClass extends MethodOverrideWP2SubClass {
	@Override
	public void DeliveryReport() {
		super.DeliveryReport();
		System.out.println("Version 3: Update the delivery message status with 'TWO' tick Mark in BLUE colour");
		
	}

}
