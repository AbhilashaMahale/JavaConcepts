package mypack;

public class ClassCastExceptionExDriverClass {
	public static void main(String[] args) {
		//subclass object creation
		ClassCastExceptionExSubClass Sub = new ClassCastExceptionExSubClass();
		//upcasting
		ClassCastExceptionExSupClass SUP = Sub;
		//or we can do this way too
		// ClassCastExceptionExSupClass SUP = new ClassCastExceptionExSubClass();
		//downcast
		ClassCastExceptionExSubClass Subd = (ClassCastExceptionExSubClass) SUP;
		
		
		//another subclass object creation
		ClassCastExceptionExSub1Class Sub1 = new ClassCastExceptionExSub1Class();
		
		//downcast to another subclass this is not possible and will throw erro
		//during execution, this is classcast exception
		ClassCastExceptionExSub1Class Sub1d = (ClassCastExceptionExSub1Class) SUP;
		
		
		
		//=======================================================
				
			//superclass object creation
		
	}

}
