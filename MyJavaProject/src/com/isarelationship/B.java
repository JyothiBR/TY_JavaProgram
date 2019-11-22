package com.isarelationship;

public class B extends A
{
static int i=100;
int j=200;
static
{
	System.out.println("from sib of b");
}
{
	System.out.println("from iib of b");
}
B()
{
	System.out.println("from b");
}
}
