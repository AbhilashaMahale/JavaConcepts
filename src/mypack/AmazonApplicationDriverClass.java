package mypack;

public class AmazonApplicationDriverClass {
	
	public static void main(String[] args) {
	AmazonApplicationLoginClass Login = new AmazonApplicationLoginClass();
	AmazonApplicationCustomerClass Custo = new AmazonApplicationCustomerClass();
	AmazonApplicationAdminsClass Adm = new AmazonApplicationAdminsClass();
	Login.loginpage(Custo);
	Login.loginpage(Adm);
	}
}
