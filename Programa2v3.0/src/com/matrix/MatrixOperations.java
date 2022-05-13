package com.matrix;

import java.util.Scanner;
import com.packg.*;

public class MatrixOperations 
{	
	private int line;
	private int column;
	private int line2;
	private int column2;
	
	
	//definindo matriz--------------------------------------------
	Scanner read = new Scanner(System.in);

	public int[][] matrixMaker(int[][] matrix) 
	{
		line = matrix.length;
		column = matrix[0].length;

		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j < column; j++) 
			{
				System.out.printf("Digite um valor para a matriz [" + line + "]" + "[" + column + "], na posição [" + (i+1) + "]" + "[" + (j + 1) + "]: ");
				matrix[i][j] = read.nextInt();
			}
		}
		return matrix;
	}
	//-------------------------------------------------------------
	
	//mostrando valores da matriz-----------------------------------------------
	public void showMatrix(int matrix[][])
	{
		line = matrix.length;
		column = matrix[0].length;
		
		for (int i = 0; i < line; i++) 
		{
			for (int j = 0; j < column; j++) 
			{
				System.out.printf("[" + matrix[i][j] + "]");
			}
			System.out.println();
		}
	}
	//---------------------------------------------------------------------------
	
	//verifica se a matriz é quadrada e só então retorna a diagonal principal------------
	public int[][] diagonalMain(int matrix[][])
	{
		line = matrix.length;
		column = matrix[0].length;
		
		if(line == column)
		{
			System.out.print("A diagonal principal da matriz é: \n");
			for (int i = 0; i < line; i++)
			{
				for (int j = 0; j < column; j++)
				{
					if (!(i == j))
					{
						matrix[i][j] = 0;
					}
				}
			}
		}
		else
		{
			System.out.println("A matriz não é quadrada, portanto, não há como realizar a operação de mostrar diagonal principal.");
		}
		return matrix;
	}
	//-----------------------------------------------------------------------------
	
	//verifica se a matriz é quadrada e só então retorna a diagonal secundaria------------
	public int[][] diagonalSecundary(int matrix[][])
	{
		line = matrix.length;
		column = matrix[0].length;
		
		if(line == column)
		{
			System.out.print("A diagonal secundaria da matriz é: \n");
			for (int i = 0; i < line; i++)
			{
				for (int j = 0; j < column; j++)
				{
					if (!(i == column - 1 - j))
					{
						matrix[i][j] = 0;
					}
				}
			}
		}
		else
		{
			System.out.println("A matriz não é quadrada, portanto, não há como realizar a operação de mostrar diagonal secundária. Veja: ");
		}
		return matrix;
	}
	
	//matriz transposta----------------------------------------------------------
	public int[][] matrixTransposed(int matrix[][])
	{
		line = matrix.length;
		column = matrix[0].length;
		int matrixAux[][] = new int[line][column];
		
		for (int i = 0; i < column; i++)
		{
			for (int j = 0; j < line; j++)
			{
				matrixAux[i][j] = matrix[j][i];
			}
		}
		for (int i = 0; i < column; i++)
		{
			for (int j = 0; j < line; j++)
			{
				matrix[i][j] = matrixAux[i][j];
			}
		}
		
		return matrix;
	}
	//-----------------------------------------------------------------------------
	
	
	//soma de matrizes-------------------------------------------------------------
	public int[][] sumMatrices(int matrix[][], int matrix2[][])
	{	
		line = matrix.length;
		column = matrix[0].length;
		line2 = matrix2.length;
		column2 = matrix2[0].length;
		
		if(line == line2 && column == column2)
		{
			int matrixSum[][];
			matrixSum = new int[line][column];
			
			for (int i = 0; i < line; i++)
			{
				for (int j = 0; j < column; j++)
				{
					matrixSum[i][j] = matrix[i][j] + matrix2[i][j];
				}
			}
			return matrixSum;
		}
		else
		{
			System.out.println("As matrizes não são de mesma ordem para realizar a soma.");
			return matrix;
		}
	}
	//-----------------------------------------------------------------------------
	
	//multiplicação de matrizes----------------------------------------------------
	public int[][] multiplicationMatrices(int[][] matrix, int[][] matrix2)  //lógica confusa.
	{	
		if(column == line2)
		{
			int matrixmult[][];
			matrixmult = new int[line][column2];
			
			for (int i = 0; i < line; i++)
			{
				for (int j = 0; j < column2; j++)
				{
					for (int k = 0; k < column; k++)
					{
						matrixmult[i][j] += matrix[i][k] * matrix2[k][j];
					}
				}
			}
			return matrixmult;
		}
		else
		{
			System.out.println("A matriz 1 e 2 não possuem similaridade de linha com coluna.");
			return matrix;
		}
	}
	//-----------------------------------------------------------------------------
}