package tarefa06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da
		 * equação completa de segundo grau, apresentando as duas raízes, se para os
		 * valores informados for possível efetuar o referido cálculo. Lembre-se de que
		 * a variável A deve ser diferente de zero.
		 */

		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC;

		System.out.println("Digite o valor da variavel A: ");
		valorA = sc.nextInt();

		System.out.println("Digite o valor da variavel B: ");
		valorB = sc.nextInt();

		System.out.println("Digite o valor da variavel C: ");
		valorC = sc.nextInt();

		if (valorA < valorB & valorB < valorC) {
			System.out
					.println("os números ordenados em ordem crescente são: " + valorA + ", " + valorB + ", " + valorC);
		} else if (valorA < valorB & valorB > valorC & valorC > valorA) {
			System.out
					.println("Os números ordenados em ordem crescente são: " + valorA + ", " + valorC + ", " + valorB);
		} else if (valorA > valorB & valorB < valorC & valorA < valorC) {
			System.out
					.println("Os números ordenados em ordem crescente são: " + valorB + ", " + valorA + ", " + valorC);
		} else if (valorA < valorB & valorA > valorC) {
			System.out
					.println("Os números ordenados em ordem crescente são: " + valorC + ", " + valorA + ", " + valorB);
		} else if (valorB < valorA & valorC > valorB) {
			System.out
					.println("Os números ordenados em ordem crescente são: " + valorB + ", " + valorC + ", " + valorA);
		} else {
			System.out
					.println("Os números ordenados em ordem crescente são: " + valorC + ", " + valorB + ", " + valorA);
		}
		sc.close();

	}

}
