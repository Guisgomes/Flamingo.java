package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00
		 * se foremcompradas pelo menos 12. Escreva um programa que leia o n�mero de
		 * ma��s compradas, calcule e escreva o custo total da compra.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de ma��s: ");
		int quantidade = sc.nextInt();
		if (quantidade < 12) {
			System.out.println("sua compra � de:" + quantidade * 1.30);
		} else{
			System.out.println("sua compra � de: " + quantidade * 1.00);
			sc.close();
		}
	}
}
