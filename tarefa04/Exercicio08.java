package tarefa04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa de computador que efetue a leitura de quatro valores
		 * inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o
		 * resultado do produto (variável P) do primeiro com o terceiro valor, e o
		 * resultado do produto (variável P) do primeiro com o terceiro valor, e o
		 * resultado da soma (variável S) do segundo com o quarto valor.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float valorA = sc.nextFloat();
		System.out.println("Digite o valor B");
		float valorB = sc.nextFloat();
		System.out.println("Digite o valor C");
		float valorC = sc.nextFloat();
		System.out.println("Digite o valor de D");
		float valorD = sc.nextFloat();
		float produto = valorA*valorC;
		float soma = valorB*valorD;
		System.out.println("O valor da variavel P é: " +produto+ "\nvalor da variavel S="+soma);
		sc.close();
	}
}
