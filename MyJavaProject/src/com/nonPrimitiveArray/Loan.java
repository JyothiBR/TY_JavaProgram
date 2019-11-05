package com.nonPrimitiveArray;

public class Loan 
{
	String name;
	double roi;
	Loan()
	{
	}
	Loan(String name, double roi)
	{
		this.roi=roi;
		this.name=name;
	}
	void interest()
	{
		System.out.println(name+" is granted at "+roi+"%");
	}

	public static void main(String[] args) 
	{
		Loan l1 = new Loan("Vehicle Loan ",12.0);
		Loan l2 = new Loan("Personal Loan ",18);
		Loan l3 = new Loan("Home Loan ", 14);
		Loan[] loan = {l1,l2,l3,new Loan("Education Loan",13)};
		for(int i=0;i<loan.length;i++)
		{
			System.out.println(loan[i].name+" "+loan[i].roi);
			loan[i].interest();
		}

	}

}
