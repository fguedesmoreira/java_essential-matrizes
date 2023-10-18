package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCadaLinha {

	/*
	 * Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual
	 * o maior elemento de cada linha. Suponha não haver empates.
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

		System.out.println("\nMAIOR ELEMENTO DE CADA LINHA:");

		for (int i = 0; i < ordem; i++) {

			int maiorElemento = 0;

			for (int j = 0; j < ordem; j++) {
				if (maiorElemento < matriz[i][j]) {
					maiorElemento = matriz[i][j];
				}
			}

			System.out.printf("Linha %d: %d%n", i + 1, maiorElemento);

		}
		
		sc.close();

	}

}