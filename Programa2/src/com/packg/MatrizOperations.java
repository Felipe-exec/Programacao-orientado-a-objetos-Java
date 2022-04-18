package com.packg;

import java.util.Scanner;

public class MatrizOperations 
{
	Scan scan = new Scan();
	
	//escanenado e mostrando valores da matriz 1---------------------------------
	public void scanShowMatrix1()
	{
		Scanner readerM1 = new Scanner(System.in);
		for (int i = 0; i < scan.getA(); i++)
		{
			for (int j = 0; j < scan.getB(); j++)
			{
				System.out.print("[" + (i+1) + "]" + "[" + (j+1) + "] = " );
				scan.getMatrix1()[i][j] = readerM1.nextInt();
			}
		}
		System.out.print("A matriz 1 é: \n");
		for (int i = 0; i < scan.getA(); i++)
		{
			for (int j = 0; j < scan.getB(); j++)
			{
				System.out.print("[" + scan.getMatrix1()[i][j] + "]");
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
		for (int i = 0; i < scan.getC(); i++)
		{
			for (int j = 0; j < scan.getD(); j++)
			{
				System.out.print("[" + (i+1) + "]" + "[" + (j+1) + "] = " );
				scan.getMatrix2()[i][j] = readerM2.nextInt();
			}
		}
		System.out.print("A matriz 2 é: \n");
		for (int i = 0; i < scan.getC(); i++)
		{
			for (int j = 0; j < scan.getD(); j++)
			{
				System.out.print("[" + scan.getMatrix2()[i][j] + "]");
			}
			System.out.print("\n");
		}
		System.out.print("-------------------------------------------\n");
	}
	//---------------------------------------------------------------------------
	
	//verifica se a matriz 1 é quadrada e só então mostra as diagonais------------
	public void diagonalM1()
	{
		if(scan.getA() == scan.getB())
		{
			System.out.print("A diagonal principal da matriz 1 é: \n");
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getB(); j++)
				{
					if (i == j)
					{
						System.out.print("[" + scan.getMatrix1()[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
			
			System.out.print("A diagonal secundaria da matriz 1 é: \n");
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getB(); j++)
				{
					if (i == scan.getB() - 1 - j)
					{
						System.out.print("[" + scan.getMatrix1()[i][j] + "]");
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
			System.out.println("A matriz 1 não é uma matriz quadrada.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//verifica se a matriz 2 é quadrada e só então mostra as diagonais------------
	public void diagonalM2()
	{
		if(scan.getC() == scan.getD())
		{
			System.out.print("A diagonal principal da matriz 2 é: \n");
			for (int i = 0; i < scan.getC(); i++)
			{
				for (int j = 0; j < scan.getD(); j++)
				{
					if (i == j)
					{
						System.out.print("[" + scan.getMatrix2()[i][j] + "]");
					}
					else
					{
						System.out.print(" .");
					}
				}
				System.out.print("\n");
			}
			System.out.print("-------------------------------------------\n");
			
			System.out.print("A diagonal secundaria da matriz 2 é: \n");
			for (int i = 0; i < scan.getC(); i++)
			{
				for (int j = 0; j < scan.getD(); j++)
				{
					if (i == scan.getD() - 1 - j)
					{
						System.out.print("[" + scan.getMatrix2()[i][j] + "]");
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
			System.out.println("A matriz 1 não é uma matriz quadrada.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//matriz 1 transposta----------------------------------------------------------
	public void matrix1Transposed()
	{
		int matrixtransposed1[][];
		matrixtransposed1 = new int[scan.getB()][scan.getA()];
		System.out.print("A matriz 1 transposta é: \n");
		for (int i = 0; i < scan.getB(); i++)
		{
			for (int j = 0; j < scan.getA(); j++)
			{
				matrixtransposed1[i][j] = scan.getMatrix1()[j][i];
			}
		}
		for (int i = 0; i < scan.getB(); i++)
		{
			for (int j = 0; j < scan.getA(); j++)
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
		matrixtransposed2 = new int[scan.getD()][scan.getC()];
		System.out.print("A matriz 2 transposta é: \n");
		for (int i = 0; i < scan.getD(); i++)
		{
			for (int j = 0; j < scan.getC(); j++)
			{
				matrixtransposed2[i][j] = scan.getMatrix2()[j][i];
			}
		}
		for (int i = 0; i < scan.getD(); i++)
		{
			for (int j = 0; j < scan.getC(); j++)
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
		if(scan.getA() == scan.getC() && scan.getB() == scan.getD())
		{
			int matrixsum[][];
			matrixsum = new int[scan.getA()][scan.getB()];
			
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getB(); j++)
				{
					matrixsum[i][j] = scan.getMatrix1()[i][j] + scan.getMatrix2()[i][j];
				}
			}
			System.out.print("A soma de matrizes é:\n");
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getB(); j++)
				{
					System.out.print("[" + matrixsum[i][j] + "]");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("As matrizes não são de mesma ordem para realizar a soma.");
		}
	}
	//-----------------------------------------------------------------------------
	
	//multiplicação de matrizes----------------------------------------------------
	public void multiplicationMatrices()  //lógica confusa.
	{
		if(scan.getB() == scan.getC())
		{
			int matrixmult[][];
			matrixmult = new int[scan.getA()][scan.getD()];
			
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getD(); j++)
				{
					for (int k = 0; k < scan.getB(); k++)
					{
						matrixmult[i][j] += scan.getMatrix1()[i][k] * scan.getMatrix2()[k][j];
					}
				}
			}
			System.out.print("A multiplicação de matrizes é:\n");
			for (int i = 0; i < scan.getA(); i++)
			{
				for (int j = 0; j < scan.getD(); j++)
				{
					System.out.print("[" + matrixmult[i][j] + "]");
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.println("A matriz 1 e 2 não possuem similaridade de linha com coluna.");
		}
	}
	//-----------------------------------------------------------------------------
}
