package com.nonsaticmembers;

public class Demo5 
{
     void m1()
     {
    	 System.out.println("from m1()");
    	 System.out.println(this);
     }
	public static void main(String[] args) 
	{
		System.out.println("from main of Demo5");
		Demo5 a=new Demo5();
		System.out.println(a);
		a.m1();
		System.out.println("end main");
	}
}
