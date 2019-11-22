package com.asgnmnt;

public class Demo1 
{
	static int i;
	static void test()
	{
		i=10;
		System.out.println(i); //directly
		System.out.println(Demo1.i);//by using class name
	}

	public static void main(String[] args) 
	{
		test();
		Demo1.test();

	}

}
