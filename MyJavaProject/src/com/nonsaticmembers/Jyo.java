package com.nonsaticmembers;

public class Jyo 
{
	void m1()
	{
		System.out.println("************");
		System.out.println(this);
	}
	void m2()
	{
		System.out.println("#############");
		System.out.println(this);
	}

	public static void main(String[] args) 
	{
		Jyo j=new Jyo();
		System.out.println(j);
		j.m1();
		j.m2();
		}
}
