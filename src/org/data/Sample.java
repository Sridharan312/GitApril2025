package org.data;

public class Sample {

	public void addition(int a, int b) {

		int c = a + b;
		System.out.println("C = " + c);
	}
	
	public void sub(int n1 , int n2) {
		
		int val;
		val=n1-n2;
		System.out.println("value :"+val);
	}

	public static void main(String[] args) {

		int a = 100 ;
		System.out.println("Value of a : " + a);
		Sample s = new Sample();
		s.addition(20, 30);
		s.sub(20, 10);
	
	}
}
