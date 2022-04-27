package com.packg;

public class Average 
{
	public double average()
	{
		double total = 0;
		double average = 0;
		for (int i = 0; i < Main.answer; i++)
		{
			total = total + Main.vetorvalues[i];
		}
		
		average = total/Main.answer;
		return average;
	}
}
