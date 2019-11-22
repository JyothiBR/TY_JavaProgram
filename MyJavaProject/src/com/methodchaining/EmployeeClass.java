package com.methodchaining;

public class EmployeeClass {

	public static void main(String[] args) 
	{

		Employee e1 = Employee.creatObject(1,"smith",12.0).Display();
		Employee e2 = Employee.creatObject(2,"allen",12.0).Display().initialize(15.0).Display();

	}

}
