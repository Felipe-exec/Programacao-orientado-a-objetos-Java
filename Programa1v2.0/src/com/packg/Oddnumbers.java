package com.packg;

public class Oddnumbers 
{
	public void oddNumbers()
	{
		double copyvetorvalues[] = Main.vetorvalues.clone();
		for (int i = 0; i < Main.answer; i ++)
		{
			if(copyvetorvalues[i] % 2 != 0)
			{
				System.out.print("[" + copyvetorvalues[i] + "]");
			}
		}
		System.out.println();
	}
}
