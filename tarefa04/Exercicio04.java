package tarefa04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a apresentação do valor da conversão em real
		 * de um valor lido em dólar. O programa deve solicitar o valor da cotação do
		 * dólar e também a quantidade de dólares disponível com o usuário, para que
		 * seja apresentado o valor em moeda brasileira.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o valor em dolar($) para converter para real(R$)");
		float dolar = sc.nextFloat();
		System.out.println("digite o valor da cotação do dolar($) em real($)");
		float cotacao = sc.nextFloat();
		float conversao = dolar * cotacao;
		System.out.println("$" + dolar + "=" + conversao);
		sc.close();

	}

}
