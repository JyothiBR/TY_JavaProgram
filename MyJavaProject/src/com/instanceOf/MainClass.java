package com.instanceOf;

public class MainClass 
{

	public static void main(String[] args) 
	{
		A ob1 = new B();
		System.out.println(ob1 instanceof A); //true
		System.out.println(ob1 instanceof B); //true
		//System.out.println(ob1 instanceof D); cte : ob1 (A) has no is-a with D
		
		B ob2 = new B();
		System.out.println(ob2 instanceof A); //true
		System.out.println(ob2 instanceof B); //true
		//System.out.println(ob2 instanceof D); cte : ob1 (B) has no is-a with D
		
		A ob3 = new A();
		System.out.println(ob3 instanceof A); //true
		System.out.println(ob3 instanceof B); //false
		//System.out.println(ob3 instanceof D); cte : ob1 (A) has no is-a with D
		

	}

}
