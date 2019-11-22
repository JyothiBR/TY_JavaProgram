package com.abstractclass;

public class RightAngleTriangle extends Shape
{
	int base;
	int height;
	RightAngleTriangle(){}
	RightAngleTriangle(int base, int height)
	{
		this.base=base;
		this.height=height;
	}
	double area()
	{
		return (0.5*base*height);
	}
	

}