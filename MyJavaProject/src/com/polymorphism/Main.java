package com.polymorphism;

public class Main {

	public static void main(String[] args) 
	{
		Bank bank;
		bank = new ICICI();
		System.out.println(bank.rateOfInterest());
		bank = new Canara();
		double rate = bank.rateOfInterest();
		System.out.println(rate);
		bank = new SBI();
		System.out.println(bank.rateOfInterest());
		bank = new SBIInTouch();
		System.out.println(bank.rateOfInterest());
		bank = new Bank();
		System.out.println(bank.rateOfInterest());
		

	}

}
