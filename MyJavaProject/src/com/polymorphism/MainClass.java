package com.polymorphism;

public class MainClass 
{
	public static void main(String[] args) 
	{
		A ob;
		ob = new A(); //from test() of A
		ob.test();
		ob = new B(); //upcasting
		ob.test(); //polymorphism
		
	}


}
