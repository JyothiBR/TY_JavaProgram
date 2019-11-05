package com.nonsaticmembers;

public class Demo7 
{
    int i;
    void test()    
    {
    	System.out.println(i);
    	i=20;
    	System.out.println(this.i);
    }
    
	public static void main(String[] args) 
	{
		Demo7 obj1=new Demo7();
		System.out.println(obj1.i);
		obj1.test();
	}

}
