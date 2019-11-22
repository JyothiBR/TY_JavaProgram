package com.abstractclass;

public class Geometry 
{
	public static void main(String[] args) 
	{
		Shape[]  array = new Shape[3];
		array[0] = new Circle(2);
		array[1] = new Rectangle(10,20);
		array[2] = new RightAngleTriangle(12,10);
	for(Shape a : array )
	{
		System.out.println("area is : "+ a.area());
	}
  }
}
