package mypack;

public class TypecastWideningEx {
	public static void main(String[] args)
	{
		/*
		//widening
		int a = 20;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("========================");
		//narrowing
		double e = 2.2;
		int f = (int)e;
		System.out.println(e);
		System.out.println(f);
		System.out.println("======");
		short s = 65;
		char c1 = (char)s;
		System.out.println(c1);
		*/
		
		
		//byte to all data type conversion 
		System.out.println("byte to all data type conversion============");
		byte a = 65;
		 System.out.println("byte value is "+a);
		short b = a;
	    System.out.println("byte to short conversion is WIDENING "+b);
	    //char c = a;
		char c = (char) a;
		System.out.println("byte to char conversion is NARROWING "+c);
		int d = a;
		System.out.println("byte to int conversion is WIDENING "+d);
		float e = a;
		System.out.println("byte to float conversion is WIDENING "+e);
		double f = a;
		System.out.println("byte to double conversion is WIDENING "+f);
		long g = a;
		System.out.println("byte to long conversion is WIDENING "+g);
		System.out.println("================================================================");
		
		
		//Short to all data type conversion
		System.out.println("Short to all data type conversion============");
		short h = 88;
		 System.out.println(" Short value is "+h);
		//byte i = h;
		 byte i = (byte)h;
	    System.out.println("Short to byte conversion is NARROWING "+i);
	    //char c = h;
		char j = (char) h;
		System.out.println("Short to char conversion is NARROWING "+j);
		int k = h;
		System.out.println("Short to int conversion is WIDENING "+k);
		float l = h;
		System.out.println("Short to float conversion is WIDENING "+l);
		double m = h;
		System.out.println("Short to double conversion is WIDENING "+m);
		long n = h;
		System.out.println("Short to long conversion is WIDENING "+n);
		System.out.println("================================================================");
		
		
		
		
		//char to all data type conversion
				System.out.println("char to all data type conversion============");
				char aa = 70;
				 System.out.println(" char value is "+aa);
				//byte bb= aa;
				 byte bb = (byte)aa;
			    System.out.println("char to byte conversion is NARROWING "+bb);
			    //short cc = aa;
				//////////System.out.println("char to short conversion is NARROWING "+cc);
				int dd = aa;
				System.out.println("char to int conversion is WIDENING "+dd);
				float ee = aa;
				System.out.println("char to float conversion is WIDENING "+ee);
				double ff = aa;
				System.out.println("char to double conversion is WIDENING "+ff);
				long gg = aa;
				System.out.println("char to long conversion is WIDENING "+gg);
				System.out.println("================================================================");
		
		
		//int  to all data type conversion
				System.out.println("int to all data type conversion============");
				int o = 88;
				 System.out.println(" int value is "+o);
				 //byte p = o;
				 byte p = (byte)o;
			    System.out.println("int to byte conversion is NARROWING "+p);
			    //char c = o;
				char q = (char) o;
				System.out.println("int to char conversion is NARROWING "+q);
				//short r = o;
				short r =(short)o;
				System.out.println("int to short conversion is NARROWING "+r);
				float s = o;
				System.out.println("int to float conversion is WIDENING "+s);
				double t = o;
				System.out.println("int to double conversion is WIDENING "+m);
				long u = o;
				System.out.println("int to long conversion is WIDENING "+u);
				System.out.println("================================================================");
				
				
				
				//float  to all data type conversion
				System.out.println("float to all data type conversion============");
				float hh = 2;
				 System.out.println(" float value is "+hh);
				 //byte ii = hh;
				 byte ii = (byte)hh;
			    System.out.println("float to byte conversion is NARROWING "+ii);
			    //char ii = hh;
				char jj = (char) hh;
				System.out.println("float to char conversion is NARROWING "+jj);
				//short kk = hh;
				short kk =(short)hh;
				System.out.println("float to short conversion is NARROWING "+kk);
				//int ll = hh;
				int ll =(int) hh;
				System.out.println("float to int conversion is NARROWING "+ll);
				double mm = hh;
				System.out.println("float to double conversion is WIDENING "+mm);
				/////////long nn = hh;
				////////////System.out.println("float to long conversion is WIDENING "+nn);
				System.out.println("================================================================");
				
				
				
				//double  to all data type conversion
				System.out.println("double to all data type conversion============");
				double A = 2.2;
				 System.out.println(" double value is "+A);
				 //byte B = A;
				 byte B = (byte)A;
			    System.out.println("double to byte conversion is NARROWING "+B);
			    //char C = A;
				char C = (char) A;
				System.out.println("double to char conversion is NARROWING "+C);
				//short D = A;
				short D =(short)A;
				System.out.println("double to short conversion is NARROWING "+D);
				//int E = A;
				int E =(int) A;
				System.out.println("double to int conversion is NARROWING "+E);
				//float F = A;
				float F = (float)A;
				System.out.println("double to float conversion is NARROWING "+F);
				//long G = A;
				long G = (long) A;
				System.out.println("double to long conversion is NARROWING "+G);
				System.out.println("================================================================");
				
				//long  to all data type conversion
				System.out.println("long to all data type conversion============");
				long H = 250;
				 System.out.println(" long value is "+H);
				 //byte I = H;
				 byte I = (byte)H;
			    System.out.println("long to byte conversion is NARROWING "+I);
			    //char J = H;
				char J = (char) H;
				System.out.println("long to char conversion is NARROWING "+J);
				//short K = H;
				short K =(short)H;
				System.out.println("long to short conversion is NARROWING "+K);
				//int L = H;
				int L =(int) H;
				System.out.println("long to int conversion is NARROWING "+L);
				//float M = H;
				//float M = H;
				/////////System.out.println("long to float conversion is NARROWING "+M);
				//DOUBLE N = H;
				double N = H;
				System.out.println("long to long conversion is WIDENING "+N);
				System.out.println("================================================================");
		
		
		
		
		
		
	}
	

}
