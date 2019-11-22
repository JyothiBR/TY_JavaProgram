package com.encapsulation;

public class Employee 
{
	private int id;
	private String name;
	double salary;
	public Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
	     return id;	
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		if(salary > this.salary)
		this.salary=salary;
		else
			System.out.println("invalvd");
	}
	public double getSalary()
	{
		return salary;
	}

}
