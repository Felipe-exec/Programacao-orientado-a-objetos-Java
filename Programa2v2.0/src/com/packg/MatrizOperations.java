package com.packg;

import java.util.Scanner;

public class MatrizOperations 
{	
	//escanenado e mostrando valores da matriz 1---------------------------------
	public void scanShowMatrix1()
	{
		Scanner readerM1 = new Scanner(System.in);
		for (int i = 0; i < Main.A; i++)
		{
			for (int j = 0; j < Main.B; j++)
			{
				System.out.print("[" + (i+1) + "]" + "[" + (j+1) + "] = " );
				Main.matrix1[i][j] = readerM1.nextInt();
			}
		}
		System.out.print("A matriz 1 �: \n");
		for (int i = 0; i < Main.A; i++)
		{
			for (int j = 0; j < Main.B; j++)
			{
				System.out.print("[" + Main.matrix1[i][j] + "]");
			}
			System.out.print("\n");
		}
		System.out.print("-------------------------------------------\n");
	}
	//---------------------------------------------------------------------------
	
	//escanenado e mostrando valores da matriz 2---------------------------------
	public void scanShowMatrix2()
	{
		Scanner readerM2 = new Scanner(System.in);
		for (int i = 0; i < Main.C; i++)
		{
			for (int j = 0; j < Main.D; j++)
			{
				System.out.print("[" + (i+1) + "]" + "[" + (j+1) + "] = " );
				Main.matrix2[i][j] = readerM2.nextInt();
			}
		}
		System.out.print("A matriz 2 �: \n");
		for (int i = 0; i < Main.C; i++)
		{
			for (int j = 0; j < Main.D; j++)
			{
				System.out.print("[" + Main.matrix2[i][j] + "]");
			}
			System.out.print("\n");
		}
		System.out.print("-------------------------------------------\n");
	}
	//---------------------------------------------------------------------------
	
	//verifica se a matriz 1 � quadrada e s� ent�o mostra as diagonais------------
	public void diagonalM1()
	{
		if(Main.A == Main.B)
		{
			System.out.print("A diagonal principal da matriz 1 �: \n");
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.B; j++)
				{
					if (i == j)
					{
						System.out.print("[" + Main.matrix1[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
			
			System.out.print("A diagonal secundaria da matriz 1 �: \n");
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.B; j++)
				{
					if (i == Main.B - 1 - j)
					{
						System.out.print("[" + Main.matrix1[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
		}
		else
		{
			System.out.println("A matriz 1 n�o � uma matriz quadrada.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//verifica se a matriz 2 � quadrada e s� ent�o mostra as diagonais------------
	public void diagonalM2()
	{
		if(Main.C == Main.D)
		{
			System.out.print("A diagonal principal da matriz 2 �: \n");
			for (int i = 0; i < Main.C; i++)
			{
				for (int j = 0; j < Main.D; j++)
				{
					if (i == j)
					{
						System.out.print("[" + Main.matrix2[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
			
			System.out.print("A diagonal secundaria da matriz 2 �: \n");
			for (int i = 0; i < Main.C; i++)
			{
				for (int j = 0; j < Main.D; j++)
				{
					if (i == Main.D - 1 - j)
					{
						System.out.print("[" + Main.matrix2[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
		}
		else
		{
			System.out.println("A matriz 1 n�o � uma matriz quadrada.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//matriz 1 transposta----------------------------------------------------------
	public void matrix1Transposed()
	{
		int matrixtransposed1[][];
		matrixtransposed1 = new int[Main.B][Main.A];
		System.out.print("A matriz 1 transposta �: \n");
		for (int i = 0; i < Main.B; i++)
		{
			for (int j = 0; j < Main.A; j++)
			{
				matrixtransposed1[i][j] = Main.matrix1[j][i];
			}
		}
		for (int i = 0; i < Main.B; i++)
		{
			for (int j = 0; j < Main.A; j++)
			{
				System.out.print("[" + matrixtransposed1[i][j] + "]");
			}
			System.out.print("\n");
		}
	}
	//-----------------------------------------------------------------------------
	
	//matriz 2 transposta----------------------------------------------------------
	public void matrix2Transposed()
	{
		int matrixtransposed2[][];
		matrixtransposed2 = new int[Main.D][Main.C];
		System.out.print("A matriz 2 transposta �: \n");
		for (int i = 0; i < Main.D; i++)
		{
			for (int j = 0; j < Main.C; j++)
			{
				matrixtransposed2[i][j] = Main.matrix2[j][i];
			}
		}
		for (int i = 0; i < Main.D; i++)
		{
			for (int j = 0; j < Main.C; j++)
			{
				System.out.print("[" + matrixtransposed2[i][j] + "]");
			}
			System.out.print("\n");
		}
	}
	//-----------------------------------------------------------------------------
	
	//soma de matrizes-------------------------------------------------------------
	public void sumMatrices()
	{
		if(Main.A == Main.C && Main.B == Main.D)
		{
			int matrixsum[][];
			matrixsum = new int[Main.A][Main.B];
			
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.B; j++)
				{
					matrixsum[i][j] = Main.matrix1[i][j] + Main.matrix2[i][j];
				}
			}
			System.out.print("A soma de matrizes �:\n");
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.B; j++)
				{
					System.out.print("[" + matrixsum[i][j] + "]");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("As matrizes n�o s�o de mesma ordem para realizar a soma.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//multiplica��o de matrizes----------------------------------------------------
	public void multiplicationMatrices()  //l�gica confusa.
	{
		if(Main.B == Main.C)
		{
			int matrixmult[][];
			matrixmult = new int[Main.A][Main.D];
			
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.D; j++)
				{
					for (int k = 0; k < Main.B; k++)
					{
						matrixmult[i][j] += Main.matrix1[i][k] * Main.matrix2[k][j];
					}
				}
			}
			System.out.print("A multiplica��o de matrizes �:\n");
			for (int i = 0; i < Main.A; i++)
			{
				for (int j = 0; j < Main.D; j++)
				{
					System.out.print("[" + matrixmult[i][j] + "]");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("A matriz 1 e 2 n�o possuem similaridade de linha com coluna.");
		}
	}
	//-----------------------------------------------------------------------------
}