package mypack;

public class CatInhertanceEx1 extends AnimalInhertanceEx1 {
	String colour;

	//tried to replace this with only colour parameter but ended up with errors
/*
	public CatInhertanceEx1(String animalType, String eats, String colour) {
		super(animalType, eats);
		this.colour = colour;
	}

*/
	public void display()
	{
		System.out.println("this is Cat Subclass");
	}


}
