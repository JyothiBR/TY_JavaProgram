package com.constructorChaining;

public class Demo 
{
     Demo()
     {
    	 System.out.println("from Demo()");
     }
     Demo(int i)
     {
    	 this();
    	 System.out.println("from Demo(int)");
     }
	public static void main(String[] args) 
	{
      Demo ob1 = new Demo();
      System.out.println("***************");
      Demo ob2 = new Demo(20);
	}

}
