package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior
		 * que 10, caso contrário escrever NÃO É MAIOR QUE 10!
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor :");
		int valor = sc.nextInt();
		if (valor > 10) {
			System.out.println("O valor digitado é maior que 10");
		} else if (valor < 10) {
			System.out.println("O valor digitado não é maior que 10");

			sc.close();
		}
	}
}
