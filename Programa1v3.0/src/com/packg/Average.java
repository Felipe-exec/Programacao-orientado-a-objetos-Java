package com.packg;

public class Average 
{
	private int answer;
	private double vetorvalues[];
	
	public double average(int answer, double vetorvalues[])
	{
		this.answer = answer;
		this.vetorvalues = vetorvalues;
		
		double total = 0;
		double average = 0;
		for (int i = 0; i < answer; i++)
		{
			total = total + vetorvalues[i];
		}
		
		average = total/answer;
		return average;
	}
}
