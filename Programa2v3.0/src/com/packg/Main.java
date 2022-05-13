package com.packg;

import java.util.Scanner;

import com.matrix.MatrixOperations;

public class Main 
{	
	public static void main(String[] args) 
	{
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int[][] matrix1;
		int[][] matrix2;
		
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

		MatrixOperations Mop = new MatrixOperations();
		

		System.out.print("As matrizes foram setadas.\n");
		System.out.print("Observação: seguir o exemplo [linha][coluna]\n");
		System.out.println("Matriz 1 = [" + A + "]" + "[" + B + "]");
		System.out.println("Matriz 2 = [" + C + "]" + "[" + D + "]");
		System.out.print("\n");
		System.out.println("Vamos escanear os valores da matriz A:");
		Mop.matrixMaker(matrix1);
		System.out.println("Vamos escanear os valores da matriz B:");
		Mop.matrixMaker(matrix2);
		System.out.println("Matriz 1:");
		Mop.showMatrix(matrix1);
		System.out.println("Matriz 2:");
		Mop.showMatrix(matrix2);
		
		int[][] diagonalMainAux1 = new int[matrix1.length][matrix1[0].length];
		int[][] diagonalSecundaryAux1 = new int[matrix1.length][matrix1[0].length];
		int[][] diagonalMainAux2 = new int[matrix2.length][matrix2[0].length];
		int[][] diagonalSecundaryAux2 = new int[matrix2.length][matrix2[0].length];
		int[][] matrix1Transposed = new int[matrix1.length][matrix1[0].length];
		int[][] matrix2Transposed = new int[matrix2.length][matrix2[0].length];
		int[][] matrixSum = new int[matrix2.length][matrix2[0].length];
		int[][] matrixMult = new int[matrix1.length][matrix2[0].length];
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("---------Diagonais da matriz 1---------");
		
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				diagonalMainAux1[i][j] = matrix1[i][j];
			}
		}
		Mop.diagonalMain(diagonalMainAux1);
		if(diagonalMainAux1.length == diagonalMainAux1[0].length)
		{
			for (int i = 0; i < diagonalMainAux1.length; i++)
			{
				for (int j = 0; j < diagonalMainAux1[0].length; j++)
				{
					System.out.print("[" + diagonalMainAux1[i][j] + "]");
				}
				System.out.println();
			}
		}
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				diagonalSecundaryAux1[i][j] = matrix1[i][j];
			}
		}
		Mop.diagonalSecundary(diagonalSecundaryAux1);
		if(matrix1.length == matrix1[0].length)
		{
			for (int i = 0; i < matrix1.length; i++)
			{
				for (int j = 0; j < matrix1[0].length; j++)
				{
					System.out.print("[" + diagonalSecundaryAux1[i][j] + "]");
				}
				System.out.println();
			}
		}
		

		System.out.println("---------Diagonais da matriz 2----------");
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2[0].length; j++)
			{
				diagonalMainAux2[i][j] = matrix2[i][j];
			}
		}
		Mop.diagonalMain(diagonalMainAux2);
		if(matrix2.length == matrix2[0].length)
		{
			for (int i = 0; i < matrix2.length; i++)
			{
				for (int j = 0; j < matrix2[0].length; j++)
				{
					System.out.print("[" + diagonalMainAux2[i][j] + "]");
				}
				System.out.println();
			}
		}

		
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2[0].length; j++)
			{
				diagonalSecundaryAux2[i][j] = matrix2[i][j];
			}
		}
		Mop.diagonalSecundary(diagonalSecundaryAux2);
		if(matrix2.length == matrix2[0].length)
		{
			for (int i = 0; i < matrix2.length; i++)
			{
				for (int j = 0; j < matrix2[0].length; j++)
				{
					System.out.print("[" + diagonalSecundaryAux2[i][j] + "]");
				}
				System.out.println();
			}
		}
		System.out.println("-----------------------------------------------------");
		
		
		System.out.println("-----------------------------------------------------");
		
		
		
		System.out.println("--Matrizes transpostas--");
		System.out.println("Matriz 1 Transposta: ");
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				matrix1Transposed[i][j] = matrix1[i][j];
			}
		}
		Mop.matrixTransposed(matrix1Transposed);
		for (int i = 0; i < matrix1[0].length; i++)
		{
			for (int j = 0; j < matrix1.length; j++)
			{
				System.out.print("[" + matrix1Transposed[i][j] + "]");
			}
			System.out.print("\n");
		}
		
		
		System.out.println("Matriz 2 Transposta: ");
		for (int i = 0; i < matrix2.length; i++)
		{
			for (int j = 0; j < matrix2[0].length; j++)
			{
				matrix2Transposed[i][j] = matrix2[i][j];
			}
		}
		Mop.matrixTransposed(matrix2Transposed);
		for (int i = 0; i < matrix2[0].length; i++)
		{
			for (int j = 0; j < matrix2.length; j++)
			{
				System.out.print("[" + matrix2Transposed[i][j] + "]");
			}
			System.out.print("\n");
		}
		System.out.println("--------------------------------------------------------");
		
		
		System.out.println("--A soma e multiplicação de Matrizes--");
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				matrixSum[i][j] = matrix1[i][j];
			}
		}
		
		
		matrixSum = Mop.sumMatrices(matrix1, matrix2);
		System.out.print("A soma de matrizes é:\n");
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix1[0].length; j++)
			{
				System.out.print("[" + matrixSum[i][j] + "]");
			}
			System.out.print("\n");
		}
		
		
		matrixMult = Mop.multiplicationMatrices(matrix1, matrix2);
		System.out.print("A multiplicação de matrizes é:\n");
		
		for (int i = 0; i < matrix1.length; i++)
		{
			for (int j = 0; j < matrix2[0].length; j++)
			{
				System.out.print("[" + matrixMult[i][j] + "]");
			}
			System.out.print("\n");
		}
	}

}
