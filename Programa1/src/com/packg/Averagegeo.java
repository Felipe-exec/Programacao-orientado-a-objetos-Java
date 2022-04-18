package com.packg;

public class Averagegeo 
{
	Scan scan = new Scan();
	
	public double averagegeo()
	{
		double value = scan.getAnswer();   //passando o valor int para double, assim não teremos bug no Math.pow(double, double).
		
		double total = 1;
		double averagegeo = 0;
		for (int i = 0; i < scan.getAnswer(); i++)
		{
			total = total * scan.getVetorvalues()[i];
		}
		
		averagegeo = Math.pow(total, 1/value);
		return averagegeo;
	}
}
