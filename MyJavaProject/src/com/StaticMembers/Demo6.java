package com.StaticMembers;

public class Demo6 
{
    static int i;
	public static void main(String[] args) 
	{
		int i=20;
		System.out.println(i);
		System.out.println(Demo6.i);
		m1();
		System.out.println(Demo6.i);
	}
	static void m1()
	{
		System.out.println(i);
		i=10;
	}
}
