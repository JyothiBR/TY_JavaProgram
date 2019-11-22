package com.arraylist;

public class Bike
{
	String color;
	double milage;
	Bike(){}
	Bike(String color, double milage)
	{
		this.color=color;
		this.milage=milage;
	}
      public String toString()
      {
    	  return "[Bike Details : "+color+","+milage+"]";
      }
}
