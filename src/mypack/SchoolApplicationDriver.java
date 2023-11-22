package mypack;

public class SchoolApplicationDriver {
	
	public static void main(String[] args) {
		SchoolLogin Login = new SchoolLogin();
	Parents Parent = new Parents();
	Staff staff = new Staff();
	Login.loginpage(Parent);
	Login.loginpage(staff);
	
	}

}
