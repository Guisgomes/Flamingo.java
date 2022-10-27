package tarefa03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e
		 * efetuar a troca dos valores de forma que a variável A passe a possuir o valor
		 * da variável B e a variável B passe a possuir o valor da variável A.
		 * Apresentar os valores trocados.
		 */

		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("Digite o valor de a:");
		a = sc.nextInt();

		System.out.println("digite o valor de b:");
		b = sc.nextInt();

		a = b;
		b = a;

		System.out.println("os valores trocador a:" + a);
		System.out.println("os valores trocador b:" + b);
		sc.close();
	}

}
