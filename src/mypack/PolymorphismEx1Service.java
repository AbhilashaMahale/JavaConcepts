package mypack;

public class PolymorphismEx1Service {
	public void CheckCapacity(PolymorphismEx1InterfaceVehicle V) {
		V.Capacity();
		
	}
	
	public static void  main(String[] args) {
		PolymorphismEx1Service S = new PolymorphismEx1Service();
		PolymorphismEx1SubClassBike Bike = new PolymorphismEx1SubClassBike();
		S.CheckCapacity(Bike);
		PolymorphismEx1SubClassBus Bus = new PolymorphismEx1SubClassBus();
		S.CheckCapacity(Bus);
		PolymorphismEx1SubClassCar Car = new PolymorphismEx1SubClassCar();
		S.CheckCapacity(Car);
		
		
	}

}
