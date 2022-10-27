package tarefa04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da
		 * diferença do primeiro valor pelo segundo.
		 */

		int resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor da variavel A");
		int valorA = sc.nextInt();
		System.out.println("digite o valor da variavel B");
		int valorB = sc.nextInt();
		resultado = valorA - valorB;
		resultado = resultado * resultado;
		System.out.println("resultado do quadrado é: "+resultado);
		sc.close();
	}

}
