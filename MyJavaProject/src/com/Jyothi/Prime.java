package com.Jyothi;
import java.util.Scanner;
public class Prime 
{
   public static void main(String[] args) 
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the integer value : ");
	   int n = sc.nextInt();
	     for(int i=2;i<=n ; i++)
	   {
	   if(n%i==0)
	   {
		   System.out.println(n+" is prime ");
		   break;
	   }
	   
	   else 
	   {
		   System.out.println(n+ " is not prime");
		   break;
	   }
	   }

	}
}
