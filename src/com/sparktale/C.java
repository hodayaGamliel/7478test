package com.sparktale;

public class C 

{
	public static int recursionMethodA(int n)
	{
		if (n == 1)
		{
			boom();
			return n;
		}
		else
		{
//			System.out.println(n);
			n = recursionMethodA(n-1);
			return n ;
		}
	}
	
	
	public static int recursionMethodB(int n)
	{
		if (n == 1)
		{
			boom();
			return n;
		}
		else
		{
//			System.out.println(n);
			n = recursionMethodB(n-1);
			return n ;
		}
	}
	
	
	public static void boom() 
	{
		try
		{
			throw new Exception();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
