package com.abstractclass;

public class Jungle 
{
	public static void main(String[] args) 
	{
		//Animal a = new Animal();
		Dog d = new Dog(5.2,12.0);
		Lion l = new Lion(6.0,15.0);
		System.out.println(d.height+" "+d.weight);
		d.talk();
		System.out.println(l.height+" "+l.weight);
		l.talk();
		}
	}
