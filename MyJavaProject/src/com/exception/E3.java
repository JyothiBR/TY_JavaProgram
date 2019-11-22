package com.exception;

public class E3 
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println(1);
		E3 ob = new E3();
		System.out.println(2);
		System.out.println(ob.i); //NoException
		System.out.println(3);
		
	}

}