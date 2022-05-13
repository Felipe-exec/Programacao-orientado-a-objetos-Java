package com.packg;

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static int answer;
	public static double vetorValues[];
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
	    answer = 0;
		System.out.print("Com quantos numeros voce deseja realizar estas operacoes? ");
		System.out.print("\n");
		System.out.print("Sua Resposta: ");;
		answer = reader.nextInt();  
		
		
		vetorValues = new double[answer]; 
		
		
		Scanner readerofvalues = new Scanner(System.in);
		int val;
		for(int i = 0; i < answer; i++)
		{
			System.out.println("Digite o numero " + (i + 1) + ":");
			val = readerofvalues.nextInt();
			vetorValues[i] = val;
		}
		
		reader.close();
		readerofvalues.close();
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("Os numeros escolhidos foram: ");
		System.out.print(Arrays.toString(vetorValues) + "\n");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		
		
		
		Average avg = new Average();
		Averagegeo avggeo = new Averagegeo();
		Evennumbers even = new Evennumbers();
		Oddnumbers odd = new Oddnumbers();
		
		System.out.println("-=-=-=-=-=-=");
		System.out.println("Seja bem vindo!");
		System.out.println("-=-=-=-=-=-=");
		

		System.out.println("A media aritmetica desses numeros: " + avg.average(answer, vetorValues));
		System.out.println("A media geometrica desses numeros: " + avggeo.averagegeo(answer, vetorValues));
		
		
		System.out.print("Numeros pares: " );
		double vetorValuesEven[] = even.evenNumbers(answer, vetorValues);
		for (int i = 0; i < vetorValuesEven.length; i++)
		{
			System.out.print("[" + vetorValuesEven[i] + "]");
		}
		
		System.out.println();
		
		System.out.print("Numeros impares: ");
		double vetorValuesOdd[] = odd.oddNumbers(answer, vetorValues);
		for (int i = 0; i < vetorValuesOdd.length; i++)
		{
			System.out.print("[" + vetorValuesOdd[i] + "]");
		}
	}
}
