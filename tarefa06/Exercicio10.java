package tarefa06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a leitura de um valor que esteja entre a
		 * faixa de 1 a 9. Após a leitura do valor fornecido pelo usuário, o programa
		 * deverá indicar uma de duas mensagens: "O valor está na faixa permitida", caso
		 * o usuário forneça o valor nesta faixa, ou a mensagem
		 * "O valor está fora da faixa permitida", caso o usuário forneça valores
		 * menores que 1 ou maiores que 9.
		 */
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero= sc.nextInt();
		
		if (numero < 1 || numero > 9) {
			System.out.println("O valor esta fora da faixa");
		} else {
			System.out.println("O valor esta dentro da faixa");
		}

		sc.close();
	}

}
