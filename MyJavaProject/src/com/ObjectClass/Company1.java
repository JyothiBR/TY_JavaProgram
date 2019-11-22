package com.ObjectClass;

public class Company1 
{

	public static void main(String[] args) 
	{
		TestEngineer Te1 = new TestEngineer(1 , "Ganesh" , 10 , "Selenium");
		TestEngineer Te2 = new TestEngineer(1 , "Ganesh" , 10 , "Selenium");
		Developer De1 = new Developer(2, "Hari" , 20 , "Java");
		Developer De2 = new Developer(2, "Hari" , 20 , "Java");
		Emp E = new Emp();
        System.out.println(Te1);
        System.out.println(Te2);
        System.out.println(De1);
        System.out.println(De2);
        System.out.println(E.equals(Te1));
        System.out.println(E.equals(De1));
        System.out.println(Te2.equals(Te2));
        System.out.println(De2.equals(De2));
        System.out.println(Te1.hashCode());
        System.out.println(De1.hashCode());
        System.out.println(Te2.hashCode());
        System.out.println(De2.hashCode());
        
        
	}

}
