package tarefa06;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		/*
		 * Ler dois valores num�ricos inteiros e apresentar o resultado da diferen�a do
		 * maior pelo menor valor.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("digite o primeiro valor");
		int valorA = sc.nextInt();
		System.out.println("digite segundo valor");
		int valorB = sc.nextInt();

		if (valorA<valorB) {
			System.out.println("O primeiro valor � menor:" +valorA);
		}else {
				System.out.println("O segundo valor � menor:" +valorB);
				sc.close();
		}
	}
}
