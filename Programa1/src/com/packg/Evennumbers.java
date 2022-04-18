package com.packg;

public class Evennumbers 
{
	Scan scan = new Scan();
	
	public void evenNumbers()
	{
		double copyvetorvalues[] = scan.getVetorvalues().clone();
		for (int i = 0; i < scan.getAnswer(); i ++)
		{
			if(copyvetorvalues[i] % 2 == 0)
			{
				System.out.print("[" + copyvetorvalues[i] + "]");
			}
		}
		System.out.println();
	}
}
