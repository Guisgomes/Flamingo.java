package tarefa04;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que efetue a leitura de três valores (A, B e C) e
		 * apresente como resultado final o quadrado da soma dos três valores lidos.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor A");
		float valorA = sc.nextFloat();
		System.out.println("Digite o valor B");
		float valorB = sc.nextFloat();
		System.out.println("Digite o valor C");
		float valorC = sc.nextFloat();
		float Soma_Do_Quadrado =(valorA+valorA)+(valorB+valorB)+(valorC+valorC);
		System.out.println("O resultado da soma é: "+Soma_Do_Quadrado);
		sc.close();
	}
}
