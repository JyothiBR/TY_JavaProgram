package com.asgnmnt;

public class Product 
{
public static int prod(int a, int b)
{
return a*b;
}
public static int prod(int a, int b,int c)
{
	return a*b*c;
}
public static double prod(double a, double b)
{
	return a*b;
}
public static void main(String[] args)
{
	int P1=prod(2,2);
	System.out.println(P1);
	int P2=prod(8,2,2);
	System.out.println(P2);
	double P3=prod(10.0,2.0);
	System.out.println(P3);
	}
}
