package com.constructorChaining;

public class Demo1 
{
	{
	System.out.println("from iib");	
	}
	
   Demo1()
   {
	   System.out.println("from Demo1()");
   }
   Demo1(boolean b)
   {
	   this();
	   System.out.println("from Demo1(boelean)");
   }
   Demo1(int i)
   {
	   this(true);
	 System.out.println("from Demo1(int)");  
   }
	public static void main(String[] args)
	{
		Demo1 ob1 = new Demo1();
		System.out.println("---------------");
		Demo1 ob2 = new Demo1(10);
		System.out.println("---------------");
		Demo1 ob3 = new Demo1(true);

	}
}
