package com.sparktale;

public class Main {
	
	public static void main(String[] args) 
	{
		A tr1 = new A();
		Thread tr11 = new Thread(tr1);
		tr11.start();
		
		
		
		B tr2 = new B();
		Thread tr12 = new Thread(tr2);
		tr12.start();
	}

}
