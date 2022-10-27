package tarefa03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
		 * fórmula: Volume = π*Raio2*Altura
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio");
		float raio = sc.nextFloat();

		System.out.println("Digite o a altura da altura");
		float altura = sc.nextFloat();

		double volume;

		volume = Math.PI * (raio * raio) * altura;

		System.out.println("o valor do volume da lata é:" + volume);

		sc.close();
	}

}
