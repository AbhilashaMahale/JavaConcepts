package mypack;

public class PolymorphismMethodoverload {
	public static void StudentInfo(String Name,int age, String Location,String BankDetails) {
		
		System.out.println("All the details provided");	
	}
	
    public static void StudentInfo(String Name,int age, String Location) {
		
		System.out.println("All the details provided except bank details");	
	}
    
    public static void main(String[] args) {
    	StudentInfo("Abhi",20,"Kar","r1234");
    	StudentInfo("Abhi",20,"Kar");
    	
    }

}
