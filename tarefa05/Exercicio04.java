
package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica
		 * simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
		 * (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever
		 * tamb�m a m�dia calculada.
		 */
		
		Scanner sc = new Scanner(System.in);
		float nota1,nota2;
		
		System.out.println("Digite a nota da primeira avalia��o");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a nota da segunda avalia��o");
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