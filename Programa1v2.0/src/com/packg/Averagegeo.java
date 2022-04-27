package com.packg;

public class Averagegeo 
{
	public double averagegeo()
	{
		double value = Main.answer;   //passando o valor int para double, assim não teremos bug no Math.pow(double, double).
		
		double total = 1;
		double averagegeo = 0;
		for (int i = 0; i < Main.answer; i++)
		{
			total = total * Main.vetorvalues[i];
		}
		
		averagegeo = Math.pow(total, 1/value);
		return averagegeo;
	}
}
