package com.ObjectClass;

public class Company extends Employee
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(1,"Vishnu",10);
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
		Employee[] e1 = {new Employee(2,"Ganesh",20),new Employee(3,"Durga",30)};
		System.out.println(e1[0]);
		System.out.println(e1[1]);
	}

}
