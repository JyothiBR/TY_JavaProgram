package com.instance_initializer_block;

public class P1 
{
	{
		System.out.println("from iib-1");
	}
	public static void main(String[] args) 
	{
		P1 ob1 = new P1();
		System.out.println("**************");
		P1 ob2 = new P1();
    }
	{
		System.out.println("from iib-2");
	}
}
