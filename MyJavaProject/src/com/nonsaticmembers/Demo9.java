package com.nonsaticmembers;

public class Demo9 
{
    int i=10;
    void test(int i)
    {
    	System.out.println(i);
    	System.out.println(this.i);
    }
    
	public static void main(String[] args) 
	{
	  Demo9 ob = new Demo9();
	  ob.test(20);
	  System.out.println(ob.i);
	}
}
