package tarefa06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
		 * n�mero lido como sendo um valor positivo, ou seja, o programa dever�
		 * apresentar o m�dulo de um n�mero fornecido. Lembre-se de verificar se o
		 * n�mero fornecido � menor que zero; sendo, multiplique-o por -1.
		 */

		Scanner sc = new Scanner(System.in);

		int valor;
		System.out.println("Digite um valor");
		valor = sc.nextInt();

		if (valor < 0) {

			int numero = valor * (-1);
			System.out.println("o modulo do numero negativo �: " + numero);

		} else if (valor >= 0) {
			System.out.println("O modulo do numero positivo �: " + -valor);
			sc.close();
		}
	}
}
