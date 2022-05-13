package com.packg;

public class Evennumbers 
{
	private int answer;
	private double vetorvalues[];
	private double even[];
	
	public double[] evenNumbers(int answer, double vetorvalues[])
	{
		this.answer = answer;
		this.vetorvalues = vetorvalues;
		
		int cont = 0;
		int contEvens = 0;
		
		for (int i = 0; i < answer; i ++)
		{
			if(vetorvalues[i] % 2 == 0)
			{
				contEvens++;
			}
		}
		
		even = new double[contEvens];
		for (int i = 0; i < answer; i++)
		{
			if(vetorvalues[i] % 2 == 0)
			{
				even[cont] = vetorvalues[i];
				cont++;
			}
		}
		return even;
	}
}