package com.abstractclass;

public class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(){}
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	double area()
	{
		return (length*breadth);
	}
	

}
