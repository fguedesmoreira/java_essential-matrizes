package application;

import java.util.Scanner;

public class ProblemaDiagonalNegativos {

	/*
	 * Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz
	 * quadrada de ordem N contendo números inteiros. Em seguida, mostrar a diagonal
	 * principal e a quantidade de valores negativos da matriz.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int ordem = sc.nextInt();

		int[][] matriz = new int[ordem][ordem];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nDIAGONAL PRINCIPAL:");

		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		int quantidadeNegativos = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					quantidadeNegativos++;
				}
			}
		}

		System.out.println();
		System.out.printf("QUANTIDADE DE NEGATIVOS = %d", quantidadeNegativos);

		sc.close();

	}

}