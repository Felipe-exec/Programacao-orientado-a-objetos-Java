package com.packg;

public class Main 
{

	public static void main(String[] args) 
	{
		Scan scan = new Scan();
		MatrizOperations Mop = new MatrizOperations();
		
		scan.scanValues();
		System.out.print("As matrizes foram setadas.\n");
		System.out.print("Observação: seguir o exemplo [linha][coluna]\n");
		System.out.println("Matriz 1 = [" + scan.getA() + "]" + "[" + scan.getB() + "]");
		System.out.println("Matriz 2 = [" + scan.getC() + "]" + "[" + scan.getD() + "]");
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
