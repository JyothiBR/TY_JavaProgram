package com.methodchaining;

public class Employee 
{
	int id;
	String name;
	double salary;

	Employee(int id, String name,double salary)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	
	static Employee creatObject(int id, String name,double salary)
	{
		Employee e1=new Employee(id,name,salary);
		return e1;
	}
	Employee initialize(double salary)
	{
		this.salary=salary;
		return this;
	}
	Employee Display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		return this;
	}
 
}

