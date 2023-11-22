package mypack;

public class AbstClassMethodEx2DriverClass {
	public static void main(String[] args)
	{
		//object create for sub class 2
		AbstClassMethodEx2Sub1Class sub2 = new AbstClassMethodEx2Sub1Class();
		sub2.login();
		sub2.logout();
		sub2.WelcomePage();
		
		//object create for sub class 1
		AbstClassMethodEx2SubClass sub1 = new AbstClassMethodEx2SubClass();
		sub1.login();
		sub1.logout();
		sub1.WelcomePage();
	}

}
