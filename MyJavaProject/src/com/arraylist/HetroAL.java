package com.arraylist;

import java.util.ArrayList;

public class HetroAL 
{
	public static void main(String[] args) 
	{
		ArrayList hetro = new ArrayList();
        hetro.add(new Bike("Red",60));
        hetro.add(new Employee(1,"Jyothi"));
        hetro.add(new Movie("Bharate",4.8));
        System.out.println(hetro);
	}

}
