package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaMatrizes {

	/*
	 * Fazer um programa para ler duas matrizes de números inteiros A e B, contendo
	 * de M linhas e N colunas cada (M e N máximo = 10). Depois, gerar uma terceira
	 * matriz C onde cada elemento desta é a soma dos elementos correspondentes das
	 * matrizes originais. Imprimir na tela a matriz gerada.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de linhas da matriz: ");
		int linhas = sc.nextInt();

		while (linhas > 10) {
			System.out.print("A matriz pode ter no máximo 10 linhas: ");
			linhas = sc.nextInt();
		}

		System.out.print("Informe a quantidade de colunas da matriz: ");
		int colunas = sc.nextInt();

		while (colunas > 10) {
			System.out.print("A matriz pode ter no máximo 10 colunas: ");
			colunas = sc.nextInt();
		}

		int[][] matrizA = new int[linhas][colunas];
		int[][] matrizB = new int[linhas][colunas];

		for (int m = 1; m < 3; m++) {

			if (m == 1) {
				System.out.println("Digite os valores da matriz A:");
			} else {
				System.out.println("Digite os valores da matriz B:");
			}

			for (int i = 0; i < linhas; i++) {

				for (int j = 0; j < colunas; j++) {
					System.out.printf("Elemento[%d,%d]: ", i, j);
					if (m == 1) {
						matrizA[i][j] = sc.nextInt();
					} else {
						matrizB[i][j] = sc.nextInt();
					}
				}

			}

		}

		sc.close();
		
		System.out.println("\nMATRIZ SOMA:");

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				System.out.printf("%d ", matrizA[i][j] + matrizB[i][j]);
			}

			System.out.println("");

		}

	}

}