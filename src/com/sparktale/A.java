package com.sparktale;

public class A implements Runnable {	

	@Override
	public void run() {
		int i;
			for( i = 1; i <= 10; i++)
			{
				System.out.println("A:" + i);
				C.recursionMethodB(20);
			}
			System.out.println("#############");
			System.out.println("#############");
			System.out.println("A:" + i);
			System.out.println("#############");
			System.out.println("#############");

		}
}
