package tarefa04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que calcule e apresente o volume de uma caixa
		 * retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o comprimento da caixa");
		float COMPRIMENTO_DA_CAIXA = sc.nextFloat();
		System.out.println("digite a largura da caixa");
		float LARGURA_DA_CAIXA = sc.nextFloat();
		System.out.println("digite a altura da caixa");
		float ALTURA_DA_CAIXA = sc.nextFloat();
		float VOLUME = COMPRIMENTO_DA_CAIXA * LARGURA_DA_CAIXA * ALTURA_DA_CAIXA;
		System.out.println("o volume da caixa retangular é: " + VOLUME);
		sc.close();

	}

}
