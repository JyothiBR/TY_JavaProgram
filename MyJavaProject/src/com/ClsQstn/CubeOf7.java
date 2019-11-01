package com.ClsQstn;

import java.util.Scanner;

public class CubeOf7
{
   public static void main(String[] args) 
   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int i = sc.nextInt();
		int seven = 7*7*7;
		if(i==seven)
			System.out.println(i+ " is a Cube of 7");
		else
			System.out.println(i+ " is not a Cube of 7");

	}

}
