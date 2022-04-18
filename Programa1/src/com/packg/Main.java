package com.packg;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scan scan = new Scan();
		Average avg = new Average();
		Averagegeo avggeo = new Averagegeo();
		Evennumbers even = new Evennumbers();
		Oddnumbers odd = new Oddnumbers();
		
		System.out.println("-=-=-=-=-=-=");
		System.out.println("Seja bem vindo!");
		System.out.println("-=-=-=-=-=-=");
		
		scan.scanValues();
		System.out.println("A media aritmetica desses numeros: " + avg.average());
		System.out.println("A media geometrica desses numeros: " + avggeo.averagegeo());
		System.out.print("Numeros pares: ");
		even.evenNumbers();
		System.out.print("Numeros impares: ");
		odd.oddNumbers();
	}
}
