package com.nonsaticmembers;

public class Cls 
{
     int i ;
     void initializing(int i)
     {
    	 this.i=i;
    	 System.out.println(this.i);
     }
	public static void main(String[] args)
	{
		Cls obj1 = new Cls();
        obj1.initializing(10);
	}

}
