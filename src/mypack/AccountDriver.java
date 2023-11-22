package mypack;

public class AccountDriver {
	public static void main(String[] args)
	{

		Account2 A = new Account2();
		System.out.println(A.deposit());
		System.out.println(A.withdraw());
		System.out.println("Account number is "+A.acno);
		System.out.println("Account balance is "+A.balance);
		System.out.println("Account Name is "+A.AccName);
		A.fixeddeposit();
		System.out.println("Account IFSC is "+A.IFSC);
	}

}
