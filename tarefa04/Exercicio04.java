package tarefa04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a apresenta��o do valor da convers�o em real
		 * de um valor lido em d�lar. O programa deve solicitar o valor da cota��o do
		 * d�lar e tamb�m a quantidade de d�lares dispon�vel com o usu�rio, para que
		 * seja apresentado o valor em moeda brasileira.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o valor em dolar($) para converter para real(R$)");
		float dolar = sc.nextFloat();
		System.out.println("digite o valor da cota��o do dolar($) em real($)");
		float cotacao = sc.nextFloat();
		float conversao = dolar * cotacao;
		System.out.println("$" + dolar + "=" + conversao);
		sc.close();

	}

}
