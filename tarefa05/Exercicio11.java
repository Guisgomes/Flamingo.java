package tarefa05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e
		 * cr�dito. Ap�s, calcular e escrever o saldo atual (saldo atual = saldo -
		 * d�bito + cr�dito). Tamb�m testar se saldo atual for maior ou igual a zero
		 * escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 'Saldo
		 * Negativo'.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o Saldo: ");
		float saldo = sc.nextFloat();

		System.out.println("Informe o D�bito: ");
		float debito = sc.nextFloat();

		System.out.println("Informe o Cr�dito: ");
		float credito = sc.nextFloat();

		float saldoAtual = saldo - debito + credito;

		if (saldoAtual > 0) {
			System.out.println("Saldo Positivo - R$" + saldoAtual);
		} else {
			System.out.println("Saldo Negativo - R$" + saldoAtual);
			sc.close();
		}

	}
}
