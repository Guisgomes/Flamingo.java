package tarefa03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
		 * utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da prestação");
		float valorDaPrestacao = sc.nextFloat();

		System.out.println("Digite o valor da taxa em %");
		float valorDaTaxa = sc.nextFloat();

		System.out.println("Digite o tempo de atraso em dias");
		int tempoDeAtraso = sc.nextInt();

		float Prestacao = (valorDaPrestacao + (tempoDeAtraso * valorDaTaxa / 100));
		System.out.println("o valor da prestacao é: " + Prestacao + "%");
		sc.close();
	}

}
