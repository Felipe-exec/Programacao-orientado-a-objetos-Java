package com.packg;

public class Oddnumbers 
{
	private int answer;
	private double vetorvalues[];
	private double odd[];
	
	public double[] oddNumbers(int answer, double vetorvalues[])
	{
		this.answer = answer;
		this.vetorvalues = vetorvalues;
		
		int contOdds = 0;
		for (int i = 0; i < answer; i ++)
		{
			if(vetorvalues[i] % 2 != 0)
			{
				contOdds++;
			}
		}
		
		odd = new double[contOdds];
		int cont = 0;
		for (int i = 0; i < answer; i ++)
		{
			if(vetorvalues[i] % 2 != 0)
			{
				odd[cont] = vetorvalues[i];
				cont++;
			}
		}
		
		return odd;
	}
}
