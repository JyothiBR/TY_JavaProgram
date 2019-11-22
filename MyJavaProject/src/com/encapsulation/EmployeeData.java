package com.encapsulation;

public class EmployeeData 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(1, "Vishnu", 10);
		System.out.println("Employee id : "+emp.getId());
		System.out.println("Employee Nmae : "+emp.getName());
		System.out.println("Employee Curren Salry : "+emp.getSalary());
		emp.setSalary(100);
		System.out.println("Employee Salary : "+emp.getSalary());
	}

}
