package com.sparktale;

public class B implements Runnable {
	
	@Override
	public void run() {
		int i;
			for( i = 1; i <= 20; i++)
			{
				System.out.println("B:" + i);
				C.recursionMethodA(10);
			}
			
			System.out.println("#############");
			System.out.println("#############");
			System.out.println("B:" + i);
			System.out.println("#############");
			System.out.println("#############");	
	}
}
