package com.miscellaneous;

public class MainClass 
{
	static void display(A ob)
	{
		System.out.println(ob.i);
		System.out.println(ob.d);
	}

	public static void main(String[] args) 
	{
		A ob1 = new A(10, 20.2);
		A ob2 = new A(100, 20.4);
		display(ob1);
		display(ob2);
	}

}
