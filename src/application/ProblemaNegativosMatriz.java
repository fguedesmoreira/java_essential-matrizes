package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNegativosMatriz {

	/*
	 * Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números
	 * inteiros, conforme exemplo. Em seguida, mostrar na tela somente os números
	 * negativos da matriz.
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

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				System.out.printf("Elemento[%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}

		}

		System.out.println("\nVALORES NEGATIVOS:");

		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] < 0)
					System.out.println(matriz[i][j]);
			}

		}
		
		sc.close();

	}

}