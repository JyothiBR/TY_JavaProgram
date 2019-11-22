package com.arraylist;

import java.util.ArrayList;

public class HetroAL1 {

	public static void main(String[] args) 
	{
		ArrayList hetro1 = new ArrayList();
        hetro1.add(new Bike("Red",60));
        hetro1.add(new Employee(1,"Jyothi"));
       // hetro.add(new Movie("Bharate",4.8));
        hetro1.add(10);
        System.out.println(hetro1);
        for(int i=0;i<hetro1.size();i++)
        {
        	Object x = hetro1.get(i);
        	if(x instanceof Bike)
        	{
        		System.out.println(((Bike)x).color);
        		System.out.println(((Bike)x).milage);
        	}
        	
        }
	}

}
