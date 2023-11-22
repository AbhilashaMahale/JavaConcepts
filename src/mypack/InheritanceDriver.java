package mypack;
import java.util.Scanner; 

public class InheritanceDriver {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//super class object
		AnimalInhertanceEx1 A = new AnimalInhertanceEx1();
		System.out.println("Mention if the animal type is wild or domestic");
		A.AnimalType = s.nextLine();
		System.out.println("Animal Type is  "+A.AnimalType);
		System.out.println("=========");
		System.out.println("Mention if the animal eats veg or Non Veg");
		A.eats = s.nextLine();
		System.out.println("Animal eats  "+A.eats);

		System.out.println("========");
		
		//sub class object
		
		CatInhertanceEx1 B = new CatInhertanceEx1();
		B.display();
		System.out.println("Mention the colour of cat");
		B.colour = s.nextLine();
		System.out.println("colour  is  "+(B.colour));
		B.AnimalType = A.AnimalType;
		System.out.println(B.AnimalType);
		B.eats = A.eats;
		System.out.println(B.eats);
		B.type();
		
		
	}


}
