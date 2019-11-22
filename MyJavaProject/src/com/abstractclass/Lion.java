package com.abstractclass;

public class Lion extends Animal
{
	Lion(){}
	Lion(double height, double weight)
	{
		super(height,weight);
	}
	void talk()
	{
		System.out.println("roar");
	}

}
