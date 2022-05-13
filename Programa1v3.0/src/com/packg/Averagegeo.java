package com.packg;

public class Averagegeo 
{
	private int answer;
	private double vetorvalues[];
	
	public double averagegeo(int answer, double vetorvalues[])
	{
		this.answer = answer;
		this.vetorvalues = vetorvalues;
		
		double value = answer;   //passando o valor int para double, assim não teremos bug no Math.pow(double, double).
		
		double total = 1;
		double averagegeo = 0;
		for (int i = 0; i < answer; i++)
		{
			total = total * vetorvalues[i];
		}
		
		averagegeo = Math.pow(total, 1/value);
		return averagegeo;
	}
}
