package com.collections;

import java.util.ArrayList;

public class AL1 
{
   public static void main(String[] args) 
   {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add("jyothi");
	System.out.println(al);
	al.add(1 , "Megha");
	System.out.println(al);
	al.add("Anjali");
	al.add("Priyanka");
	System.out.println(al.isEmpty());//false
	System.out.println(al.size());//6
	al.add("Kirthana");
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	Object ob = al.set(5, "Asmitha");
	System.out.println(ob);//Priyanka
	System.out.println(al.contains("Pratibha"));//false
	System.out.println(al.add(20));
	System.out.println(al);
	System.out.println(al.indexOf(20));
	
	
	
	
	
	}

}
