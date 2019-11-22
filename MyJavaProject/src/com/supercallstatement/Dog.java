package com.supercallstatement;

public class Dog extends Animal
{
	String color;
	Dog(int height, int weight, String color)
	{
		super(height,weight);
		this.color=color;
	}
	public static void main(String[] args) 
	{
		Dog d = new Dog(22,27,"white");
		System.out.println(d.height);
		System.out.println(d.weight);
		System.out.println(d.color);
	}

}
