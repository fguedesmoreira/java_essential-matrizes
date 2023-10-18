package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMatrizGeral {

	/*
	 * Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em
	 * seguida, fazer as seguintes ações:
	 */
	// a) calcular e imprimir a soma de todos os elementos positivos da matriz.
	// b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os
	// elementos desta linha.
	// c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos
	// os elementos desta coluna.
	// d) imprimir os elementos da diagonal principal da matriz.
	// e) alterar a matriz elevando ao quadrado todos os números negativos da mesma.
	// Em seguida imprimir
	// a matriz alterada.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a ordem da matriz: ");
		int ordem = sc.nextInt();

		while (ordem > 10) {
			System.out.print("A matriz pode ser no máximo 10x10: ");
			ordem = sc.nextInt();
		}

		double[][] matriz = new double[ordem][ordem];

		for (int i = 0; i < ordem; i++) {

			for (int j = 0; j < ordem; j++) {
				System.out.printf("Elemento[%d,%d]: ", i, j);
				matriz[i][j] = sc.nextDouble();
			}

		}

		// somatório positivos (a)
		double somaPositivos = 0.0;

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos += matriz[i][j];
				}
			}
		}

		System.out.printf("%nSOMA DOS POSITIVOS: %.1f%n", somaPositivos);

		System.out.println();

		// linha (b)
		System.out.print("Escolha uma linha da matriz: ");
		int linha = sc.nextInt();

		while (linha > ordem) {
			System.out.printf("A linha deve ser no máximo %d: ", ordem);
			linha = sc.nextInt();
		}

		System.out.print("LINHA ESCOLHIDA: ");

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (i == linha) {
					System.out.printf("%.1f ", matriz[i][j]);
				}
			}
		}

		System.out.println();

		// coluna (c)
		System.out.print("\nEscolha uma coluna da matriz: ");
		int coluna = sc.nextInt();

		while (linha > ordem) {
			System.out.printf("A coluna deve ser no máximo %d: ", ordem);
			coluna = sc.nextInt();
		}

		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (j == coluna) {
					System.out.printf("%.1f ", matriz[i][j]);
				}
			}
		}

		sc.close();

		System.out.println();

		// diagonal principal (d)
		System.out.print("\nDIAGONAL PRINCIPAL: ");

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (i == j) {
					System.out.printf("%.1f ", matriz[i][j]);
				}
			}
		}

		System.out.println();

		// alteração da matriz
		System.out.println("\nMATRIZ ALTERADA: ");

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j], 2.0);
				}
			}
		}
		
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.printf("%.1f ", matriz[i][j]);
			}
			System.out.println();
		}

	}

}