package mypack;

public class DriverHierachyEx1 {
	public static void main(String[] args) {
		
		HierachySavingsEx1 sav = new HierachySavingsEx1();
		sav.ROI();
		System.out.println("Rate of ineterest is "+sav.ROI);
		sav.deposit();	
		sav.withdrawn();
		System.out.println("Account holder name is "+sav.AccName);
		System.out.println("Account number is "+sav.AccNumber);
		System.out.println("Account balancee is "+sav.balance);
		System.out.println("======================");
		
		HierachyCurrentEx1 cur = new HierachyCurrentEx1();
		cur.MinBlanace();
		System.out.println("Account Minimu Balace is "+cur.MinBalance);
		System.out.println("Account holder name is "+sav.AccName);
		System.out.println("Account number is "+sav.AccNumber);
		System.out.println("Account balancee is "+sav.balance);
		sav.deposit();	
		sav.withdrawn();
		
		
		
	}
	
	

}
