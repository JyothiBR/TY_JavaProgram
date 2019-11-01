package com.StaticMembers;

public class Demo4 
{
	static int i=10;
   public static void main(String[] args)
   {
		System.out.println(i); //10
		Demo4.i=30;
		System.out.println(i); //30
		}

}
