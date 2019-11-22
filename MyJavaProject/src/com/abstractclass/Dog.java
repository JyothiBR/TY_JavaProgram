package com.abstractclass;

public class Dog extends Animal
{
	Dog(){}
	Dog(double height, double weight)
	{
		super(height,weight);
	}
	void talk()
	{
		System.out.println("bow wow");
	}

}
