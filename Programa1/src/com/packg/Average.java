package com.packg;

public class Average 
{
	Scan scan = new Scan();
	
	public double average()
	{
		double total = 0;
		double average = 0;
		for (int i = 0; i < scan.getAnswer(); i++)
		{
			total = total + scan.getVetorvalues()[i];
		}
		
		average = total/scan.getAnswer();
		return average;
	}
}
