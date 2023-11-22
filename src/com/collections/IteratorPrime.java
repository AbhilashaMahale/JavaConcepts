package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPrime {
	
	public static boolean isPrime(int n) 
	{
		int count = 0;
		for(int i = 2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==0) 
			{
				return true;
				
			}
			else
			{
				return false;
			}

	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a  = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(8);
		a.add(9);
		a.add(7);
		a.add(2);
		a.add(3);
		a.add(39);
		a.add(15);
		a.add(56);
		a.add(68);
		a.add(72);
		a.add(99);
		Iterator i = a.iterator();
		while(i.hasNext()) {
			int k = (int) i.next();
			if(isPrime(k)) {
				System.out.println(k);
			}
		}
		

	}

}
