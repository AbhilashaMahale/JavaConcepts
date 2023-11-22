package mypack;

public class DerivedCastingExDriverClass {
	public static void main(String[] args) {
		DerivedCastingExSubClass D = new DerivedCastingExSubClass();
		DerivedCastingExSupClass S = D;
		S.test();
		//S.count();
		DerivedCastingExSubClass D1 = (DerivedCastingExSubClass)S;
		D1.test();
		D1.count();
	}

}
