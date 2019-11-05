package com.nonPrimitiveArray;
import java.util.Scanner;
public class EvenNoUser 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int []ar = new int[size];
		for(int  i=0;i<ar.length;i++)
		{
			System.out.println("enter the even elements ");
			ar[i]=sc.nextInt();
		}
		for(int x : ar)
		{
			System.out.println(x+1);
		}
			
		}

	}


