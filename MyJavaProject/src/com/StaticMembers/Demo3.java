package com.StaticMembers;

public class Demo3 
{
     static int i=10;
	public static void main(String[] args)
	{
	System.out.println(i); //10
	i=20;
	System.out.println(Demo3.i); //20
}

}
