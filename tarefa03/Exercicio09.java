package tarefa03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso,
		 * utilizando a f�rmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da presta��o");
		float valorDaPrestacao = sc.nextFloat();

		System.out.println("Digite o valor da taxa em %");
		float valorDaTaxa = sc.nextFloat();

		System.out.println("Digite o tempo de atraso em dias");
		int tempoDeAtraso = sc.nextInt();

		float Prestacao = (valorDaPrestacao + (tempoDeAtraso * valorDaTaxa / 100));
		System.out.println("o valor da prestacao �: " + Prestacao + "%");
		sc.close();
	}

}
