package com.ObjectClass;

public class Employee 
{
	int id;
	String name;
	double salary;
	Employee(){}
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id+" "+name+ " "+salary;
	}

}
