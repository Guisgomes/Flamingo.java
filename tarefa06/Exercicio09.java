package tarefa06;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a leitura de um número inteiro e apresentar
		 * uma mensagem informando se o número é par ou ímpar.
		 */
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero % 2 == 1) {
			System.out.println("o número é ímpar");
		} else {
			System.out.println(" o número é par");
		}

		sc.close();
	}

}
