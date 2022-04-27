package com.packg;

import java.util.Scanner;

public class Main 
{
	public static int A = 0;
	public static int B = 0;
	public static int C = 0;
	public static int D = 0;
	public static int matrix1[][];
	public static int matrix2[][];
	
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Digite o valor da linha da Matriz 1: ");
		A = reader.nextInt();
		System.out.print("Digite o valor da coluna da Matriz 1: ");
		B = reader.nextInt();
		System.out.print("Digite o valor da linha da Matriz 2: ");
		C = reader.nextInt();
		System.out.print("Digite o valor da coluna da Matriz 2: ");
		D = reader.nextInt();
		
		matrix1 = new int[A][B];
		matrix2 = new int[C][D];

		MatrizOperations Mop = new MatrizOperations();
		

		System.out.print("As matrizes foram setadas.\n");
		System.out.print("Observação: seguir o exemplo [linha][coluna]\n");
		System.out.println("Matriz 1 = [" + A + "]" + "[" + B + "]");
		System.out.println("Matriz 2 = [" + C + "]" + "[" + D + "]");
		System.out.print("\n");
		System.out.println("Vamos escanear os valores das matrizes 1 e 2:");
		Mop.scanShowMatrix1();
		Mop.scanShowMatrix2();
		System.out.println("-----------------------------------------------------");
		System.out.println("--Diagonais--");
		Mop.diagonalM1();
		Mop.diagonalM2();
		System.out.println("---------------------");
		System.out.println("--Matrizes transpostas--");
		Mop.matrix1Transposed();
		Mop.matrix2Transposed();
		System.out.println("---------------------");
		System.out.println("--A soma e multiplicação de Matrizes--");
		Mop.sumMatrices();
		Mop.multiplicationMatrices();
	}

}
