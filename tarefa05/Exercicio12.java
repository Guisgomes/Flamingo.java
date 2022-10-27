package tarefa05;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		/*
		 * Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em
		 * estoque e quantidade m�nima em estoque de um produto. Calcular e escrever a
		 * quantidade m�dia ((quantidadem�dia = quantidade m�xima + quantidade
		 * m�nima)/2). Se a quantidade em estoque for maior ou igual a quantidade m�dia
		 * escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar
		 * compra'.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade atual desse produto em estoque: ");
		float quantidadeAtual = sc.nextFloat();

		System.out.println("Informe a quantidade m�nima desse produto em estoque: ");
		float quantidadeMinima = sc.nextFloat();

		System.out.println("Informe a quantidade m�xima desse produto em estoque: ");
		float quantidadeMaxima = sc.nextFloat();

		float quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("N�o efetuar a compra!");
		} else {
			System.out.println("Efetuar a compra!");
			sc.close();

		}

	}
}
