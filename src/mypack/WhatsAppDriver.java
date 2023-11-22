package mypack;

public class WhatsAppDriver {
	public static void main(String[] args)
	{
		WhatsApp1 w1 = new WhatsApp1();
		w1.message();
		System.out.println(w1.version);
		System.out.println(w1.size);
		
		System.out.println("========");
		WhatsApp2 w2 = new WhatsApp2();
		w2.audiocall();
		System.out.println(w2.theme);
		System.out.println(w2.version);
		System.out.println(w2.size);
	}

}
