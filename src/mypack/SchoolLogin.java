package mypack;

public class SchoolLogin {
	
	public SchoolApplication loginpage(SchoolApplication Application) // SchoolApplication Application = new Application();
	{
		if(Application instanceof Parents) {
			
			Parents P = (Parents) Application;
			P.MakePayment();
			P.CheckForSchoolUpdates();
			return P;
		}
		else if(Application instanceof Staff)
		{
			Staff S = (Staff) Application;
			S.ConfirmPayment();
			S.UpdateSchoolUpdates();
			return S;
		}
		else {
			System.out.println("Invalid Data");
			return null;
		}
		
	}

}
