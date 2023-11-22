package mypack;

public class MethodOverrideWP2SubClass extends MethodOverrideWP1SupClass {
	
	@Override
	public void DeliveryReport() {
		super.DeliveryReport();
		System.out.println("Version 2: Update the delivery message status with 'TWO' tick Mark in GRAY colour");
		
	}


}
