package com.isarelationship;

public class MainClass 
{
	public static void main(String[] args) 
	{
		P2.i=10;
		System.out.println(P2.i);
		System.out.println(P1.i);
		P1.i=20;
		System.out.println(P2.i);
		P1.test();
		P2.test();
	}

}
