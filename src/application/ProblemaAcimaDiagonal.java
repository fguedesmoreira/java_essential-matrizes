package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAcimaDiagonal {

	/*
	 * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N contendo
	 * números inteiros. Mostrar a soma dos elementos acima da diagonal principal.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a ordem da matriz: ");
		int ordem = sc.nextInt();

		while (ordem > 10) {
			System.out.print("A matriz pode ser no máximo 10x10: ");
			ordem = sc.nextInt();
		}

		int[][] matriz = new int[ordem][ordem];

		for (int i = 0; i < ordem; i++) {

			for (int j = 0; j < ordem; j++) {
				System.out.printf("Elemento[%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}

		}

		sc.close();

		int somatorio = 0;

		for (int i = 0; i < ordem; i++) {

			for (int j = 0; j < ordem; j++) {
				if (j > i) {
					somatorio += matriz[i][j];
				}
			}

		}

		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", somatorio);

	}

}