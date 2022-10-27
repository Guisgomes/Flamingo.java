package tarefa06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir
		 * uma mensagem dizendo que o aluno foi aprovado, se o valor da m�dia escolar
		 * for maior ou igual a 5. Se o aluno n�o foi aprovado, indicar uma mensagem
		 * informando esta condi��o. Apresentar junto das mensagens o valor da m�dia do
		 * aluno para qualquer condi��o.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a segunda nota");
		float nota2 = sc.nextFloat();

		System.out.println("Digite a terceira nota");
		float nota3 = sc.nextFloat();

		System.out.println("Digite a quarta nota");
		float nota4 = sc.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {
			System.out.println("O aluno foi aprovado: " + media);
		} else {
			System.out.println("O aluno foi reprovado: " +media);
			sc.close();
		}
	}
}
