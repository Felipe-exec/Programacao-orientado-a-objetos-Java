package com.packg;

import java.util.Arrays;
import java.util.Scanner;

public class Scan 
{
	private static int answer;
	private static double vetorvalues[];
	
	public void scanValues()
	{
		Scanner reader = new Scanner(System.in);
	    answer = 0;
		System.out.print("Com quantos numeros voce deseja realizar estas operacoes? ");
		System.out.print("\n");
		System.out.print("Sua Resposta: ");;
		answer = reader.nextInt();  
		
		
		vetorvalues = new double[answer]; 
		
		
		Scanner readerofvalues = new Scanner(System.in);
		int val;
		for(int i = 0; i < answer; i++)
		{
			System.out.println("Digite o numero " + (i + 1) + ":");
			val = readerofvalues.nextInt();
			vetorvalues[i] = val;
		}
		reader.close();
		readerofvalues.close();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Os numeros escolhidos foram: ");
		System.out.print(Arrays.toString(vetorvalues) + "\n");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
	}

	public int getAnswer() {
		return answer;
	}

	public double[] getVetorvalues() {
		return vetorvalues;
	}
	
}
