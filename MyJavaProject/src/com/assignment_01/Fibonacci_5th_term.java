package com.assignment_01;

public class Fibonacci_5th_term
{
public static void main(String[] args) 
	{
	int n1=0;
	int n2=1;
	int sum=0;
	int count=2;
	for(int i=3;i<=8;i++)
	{
    sum=n1+n2;
    n1=n2;
    n2=sum;
    count++;
    if(count==sum)
    	break;
    	}
    	System.out.println(sum);
	}
}