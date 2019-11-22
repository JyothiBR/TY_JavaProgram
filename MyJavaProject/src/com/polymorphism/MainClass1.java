package com.polymorphism;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		A ob;
		ob = new B();
		ob.test();
		
		ob = new C();
		ob.test();
		
		ob = new A();
		ob.test();
		
		ob = new B();
		ob.test();
		
		
	}

}
