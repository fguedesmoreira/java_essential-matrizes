package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaLinhas {

	/*
	 * Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em
	 * seguida, ler uma matriz de M linhas e N colunas contendo números reais. Gerar
	 * um vetor de modo que cada elemento do vetor seja a soma dos elementos da
	 * linha correspondente da matriz. Mostrar o vetor gerado.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linhas = sc.nextInt();

		System.out.print("Qual a quantidade de colunas da matriz? ");
		int colunas = sc.nextInt();

		double[][] matriz = new double[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("Digite os elementos da %dª linha:%n", i + 1);
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}

		sc.close();
		
		double[] vetor = new double[linhas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				vetor[i] += matriz[i][j];
			}
		}

		System.out.println("\nVETOR GERADO");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f%n", vetor[i]);
		}

	}

}