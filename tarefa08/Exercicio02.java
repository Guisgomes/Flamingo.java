package tarefa08;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// Apresentar o total da soma obtida dos cem primeiros números inteiros
		// (1+2+3+4+...+98+99+100).
		int numero, soma;

		Scanner sc = new Scanner(System.in);

		numero = 1;
		soma = 0;

		while (numero <= 100) {
			soma = soma + numero;
			numero = numero + 1;
			System.out.println("A soma dos numeros inteiros é: " + soma);
			sc.close();
		}

	}

}
