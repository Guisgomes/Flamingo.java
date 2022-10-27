package tarefa05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
		 * mês em que a pessoa nasceu).
		 */
		Scanner sc = new Scanner(System.in);
		int anoNascimento, anoAtual;
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = sc.nextInt();

		System.out.println("Digite o ano atual");
		anoAtual = sc.nextInt();
		
		int voto =anoAtual-anoNascimento;

		if (voto >= 16) {
			System.out.println("Você pode votar");
		} else 
			System.out.println("você não pode votar");
			sc.close();
		}
	}
