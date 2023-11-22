package mypack;

public class AmazonApplicationLoginClass {
	
	public void loginpage(AmazonApplicationSuperClass Amazon) //AmazonApplicationSuperClass Amazon = Custo;
	{
		if(Amazon instanceof AmazonApplicationCustomerClass) {
			AmazonApplicationCustomerClass Customer = (AmazonApplicationCustomerClass) Amazon;
			Customer.buyProduct();
			Customer.cancelProduct();
		}
		else if(Amazon instanceof AmazonApplicationAdminsClass) {
			AmazonApplicationAdminsClass Admin = (AmazonApplicationAdminsClass) Amazon;
			Admin.AddProduct();
			Admin.RemoveProduct();
			
			
			
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args) {
		
	}

}
