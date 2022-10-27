package tarefa05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o
		 * maior deles.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();

		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("o primeiro valor é maior");

		} else if (valor1 < valor2) {
			System.out.println(" o segundo valor é maior");
			sc.close();
		}

	}

}
