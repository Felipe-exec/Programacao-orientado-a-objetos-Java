package com.packg;

import java.util.Scanner;

public class Scan 
{
	private static int A = 0;
	private static int B = 0;
	private static int C = 0;
	private static int D = 0;
	private static int matrix1[][];
	private static int matrix2[][];
	
	public void scanValues()
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
	    
	}

	public int getA() {
		return A;
	}

	public int getB() {
		return B;
	}

	public int getC() {
		return C;
	}

	public int getD() {
		return D;
	}

	public int[][] getMatrix1() {
		return matrix1;
	}

	public int[][] getMatrix2() {
		return matrix2;
	}
}
