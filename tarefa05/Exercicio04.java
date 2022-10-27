
package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
		 * simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
		 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
		 * também a média calculada.
		 */
		
		Scanner sc = new Scanner(System.in);
		float nota1,nota2;
		
		System.out.println("Digite a nota da primeira avaliação");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a nota da segunda avaliação");
		nota2 = sc.nextFloat();
		
		float mediaFinal = (nota1+nota2)/2;
		
		if (mediaFinal < 6) {
			System.out.println("o aluno foi reprovado");
		} else if (mediaFinal >=6) {
			System.out.println("o aluno foi aprovado");
			sc.close();
		}
		}

	}