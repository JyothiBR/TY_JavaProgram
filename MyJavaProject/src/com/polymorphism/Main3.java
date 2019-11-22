package com.polymorphism;

public class Main3 
{
	static void display(Bank bank)
	{
		System.out.println(bank.rateOfInterest());
	}

	public static void main(String[] args) 
	{
		Bank b1;
		b1 = new ICICI();
		display(b1);
		b1 = new Canara();
		display(b1);
		b1 = new SBI();
		display(b1);
		b1 = new SBIInTouch();
		display(b1);
		b1 = new Bank();
		display(b1);

	}

}
